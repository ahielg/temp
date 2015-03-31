package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout;

public class IcsLinearLayout extends NineLinearLayout
{
  private static final int[] LinearLayout;
  private static final int LinearLayout_divider = 0;
  private static final int LinearLayout_dividerPadding = 2;
  private static final int LinearLayout_showDividers = 1;
  public static final int SHOW_DIVIDER_BEGINNING = 1;
  public static final int SHOW_DIVIDER_END = 4;
  public static final int SHOW_DIVIDER_MIDDLE = 2;
  public static final int SHOW_DIVIDER_NONE;
  private Drawable mDivider;
  private int mDividerHeight;
  private int mDividerPadding;
  private int mDividerWidth;
  private int mShowDividers;

  static
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = 16843049;
    arrayOfInt[1] = 16843561;
    arrayOfInt[2] = 16843562;
    LinearLayout = arrayOfInt;
  }

  public IcsLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, LinearLayout);
    setDividerDrawable(localTypedArray.getDrawable(0));
    this.mShowDividers = localTypedArray.getInt(1, 0);
    this.mDividerPadding = localTypedArray.getDimensionPixelSize(2, 0);
    localTypedArray.recycle();
  }

  void drawDividersHorizontal(Canvas paramCanvas)
  {
    int i = getChildCount();
    int j = 0;
    View localView2;
    if (j >= i)
      if (hasDividerBeforeChildAt(i))
      {
        localView2 = getChildAt(i - 1);
        if (localView2 != null)
          break label120;
      }
    for (int k = getWidth() - getPaddingRight() - this.mDividerWidth; ; k = localView2.getRight())
    {
      drawVerticalDivider(paramCanvas, k);
      return;
      View localView1 = getChildAt(j);
      if ((localView1 != null) && (localView1.getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView1.getLayoutParams();
        drawVerticalDivider(paramCanvas, localView1.getLeft() - localLayoutParams.leftMargin);
      }
      j++;
      break;
      label120: ((LinearLayout.LayoutParams)localView2.getLayoutParams());
    }
  }

  void drawDividersVertical(Canvas paramCanvas)
  {
    int i = getChildCount();
    int j = 0;
    View localView2;
    if (j >= i)
      if (hasDividerBeforeChildAt(i))
      {
        localView2 = getChildAt(i - 1);
        if (localView2 != null)
          break label120;
      }
    for (int k = getHeight() - getPaddingBottom() - this.mDividerHeight; ; k = localView2.getBottom())
    {
      drawHorizontalDivider(paramCanvas, k);
      return;
      View localView1 = getChildAt(j);
      if ((localView1 != null) && (localView1.getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView1.getLayoutParams();
        drawHorizontalDivider(paramCanvas, localView1.getTop() - localLayoutParams.topMargin);
      }
      j++;
      break;
      label120: ((LinearLayout.LayoutParams)localView2.getLayoutParams());
    }
  }

  void drawHorizontalDivider(Canvas paramCanvas, int paramInt)
  {
    this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, paramInt, getWidth() - getPaddingRight() - this.mDividerPadding, paramInt + this.mDividerHeight);
    this.mDivider.draw(paramCanvas);
  }

  void drawVerticalDivider(Canvas paramCanvas, int paramInt)
  {
    this.mDivider.setBounds(paramInt, getPaddingTop() + this.mDividerPadding, paramInt + this.mDividerWidth, getHeight() - getPaddingBottom() - this.mDividerPadding);
    this.mDivider.draw(paramCanvas);
  }

  public int getDividerPadding()
  {
    return this.mDividerPadding;
  }

  public int getDividerWidth()
  {
    return this.mDividerWidth;
  }

  public int getShowDividers()
  {
    return this.mShowDividers;
  }

  protected boolean hasDividerBeforeChildAt(int paramInt)
  {
    int i = 1;
    if (paramInt == 0)
      if ((0x1 & this.mShowDividers) == 0);
    while (true)
    {
      return i;
      i = 0;
      continue;
      if (paramInt == getChildCount())
      {
        if ((0x4 & this.mShowDividers) != 0)
          continue;
        i = 0;
        continue;
      }
      if ((0x2 & this.mShowDividers) != 0)
      {
        i = 0;
        for (int j = paramInt - 1; ; j--)
        {
          if (j < 0)
            break label85;
          if (getChildAt(j).getVisibility() == 8)
            continue;
          i = 1;
          break;
        }
        label85: continue;
      }
      i = 0;
    }
  }

  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = indexOfChild(paramView);
    int j = getOrientation();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if (hasDividerBeforeChildAt(i))
    {
      if (j == 1)
        localLayoutParams.topMargin = this.mDividerHeight;
    }
    else
    {
      int k = getChildCount();
      if ((i == k - 1) && (hasDividerBeforeChildAt(k)))
      {
        if (j != 1)
          break label109;
        localLayoutParams.bottomMargin = this.mDividerHeight;
      }
    }
    while (true)
    {
      super.measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      localLayoutParams.leftMargin = this.mDividerWidth;
      break;
      label109: localLayoutParams.rightMargin = this.mDividerWidth;
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if (this.mDivider != null)
    {
      if (getOrientation() != 1)
        break label26;
      drawDividersVertical(paramCanvas);
    }
    while (true)
    {
      super.onDraw(paramCanvas);
      return;
      label26: drawDividersHorizontal(paramCanvas);
    }
  }

  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    if (paramDrawable == this.mDivider)
      return;
    this.mDivider = paramDrawable;
    if (paramDrawable != null)
      this.mDividerWidth = paramDrawable.getIntrinsicWidth();
    for (this.mDividerHeight = paramDrawable.getIntrinsicHeight(); ; this.mDividerHeight = 0)
    {
      if (paramDrawable == null)
        bool = true;
      setWillNotDraw(bool);
      requestLayout();
      break;
      this.mDividerWidth = 0;
    }
  }

  public void setDividerPadding(int paramInt)
  {
    this.mDividerPadding = paramInt;
  }

  public void setShowDividers(int paramInt)
  {
    if (paramInt != this.mShowDividers)
    {
      requestLayout();
      invalidate();
    }
    this.mShowDividers = paramInt;
  }
}

/* Location:           D:\MySoftware\decomp\classes_dex2jar.jar
 * Qualified Name:     com.actionbarsherlock.internal.widget.IcsLinearLayout
 * JD-Core Version:    0.6.0
 */