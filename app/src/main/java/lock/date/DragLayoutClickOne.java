package lock.date;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * 可拖拽的父容器Layout，只需要将内容图片在xml布局文件中设置在父容器内即可
 * 1.主要利用ViewDragHelper这个类来实现拖拽
 * Created by CaiXi on 2016/8/23.
 */
public class DragLayoutClickOne extends RelativeLayout {
    private ViewDragHelper mDragger;
    private  int clicktime=0;

    public DragLayoutClickOne(Context context) {
        this(context, null);
    }

    public DragLayoutClickOne(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragLayoutClickOne(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mDragger = ViewDragHelper.create(this, 1.0f, new ViewDragHelper.Callback() {
            @Override
            public boolean tryCaptureView(View child, int pointerId) {
                return true;
            }

            @Override
            public int clampViewPositionHorizontal(View child, int left, int dx) {
                final int leftBound = getPaddingLeft();
                final int rightBound = getWidth() - child.getWidth() - leftBound;
                final int newLeft = Math.min(Math.max(left, leftBound), rightBound);
                return newLeft;
            }

            @Override
            public int clampViewPositionVertical(View child, int top, int dy) {
                final int topBound = getPaddingTop();
                final int bottomBound = getHeight() - child.getHeight();
                final int newTop = Math.min(Math.max(top, topBound), bottomBound);
                return newTop;
            }

            @Override
            public int getViewHorizontalDragRange(View child) {
                return getMeasuredWidth() - child.getMeasuredWidth();
            }

            @Override
            public int getViewVerticalDragRange(View child) {
                return getMeasuredHeight() - child.getMeasuredHeight();
            }

            @Override
            public void onViewReleased(View releasedChild, float xvel, float yvel) {
                moveToSide(releasedChild);
                invalidate();
            }
        });
    }



    private void moveToSide(View view) {
        float top = view.getTop();
        float bottom = getMeasuredHeight() - view.getBottom();
        float right = getMeasuredWidth() - view.getRight();
        float left = view.getLeft();
        //上下滑动
        if ((top < bottom ? top : bottom) / getMeasuredHeight() < (right < left ? right : left) / getMeasuredWidth()) {
            mDragger.settleCapturedViewAt(view.getLeft(), top < bottom ? 0 : getMeasuredHeight() - view.getMeasuredHeight());
        } else {
            //左右滑动
            mDragger.settleCapturedViewAt(left < right ? 0 : getMeasuredWidth() - view.getMeasuredWidth(), view.getTop());
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        System.out.println("Drag.onInterceptTouchEvent");
        return mDragger.shouldInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("Drag.onTouchEvent");
        if(clicktime==0){
            DateUtil.sendDismiss();
            clicktime=-1;
        }
        mDragger.processTouchEvent(event);
        return false;
    }

    @Override
    public void computeScroll() {
        System.out.println("Drag.computeScroll");
        if (mDragger.continueSettling(true)) {
            System.out.println("Drag.continueSettling");
            invalidate();
        }
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setClickable(true);
        }
    }
}
