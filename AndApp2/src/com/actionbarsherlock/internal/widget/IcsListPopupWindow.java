package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.actionbarsherlock.R.attr;

public class IcsListPopupWindow
{
  private static final int EXPAND_LIST_TIMEOUT = 250;
  public static final int POSITION_PROMPT_ABOVE = 0;
  public static final int POSITION_PROMPT_BELOW = 1;
  private ListAdapter mAdapter;
  private Context mContext;
  private View mDropDownAnchorView;
  private int mDropDownHeight = -2;
  private int mDropDownHorizontalOffset;
  private DropDownListView mDropDownList;
  private Drawable mDropDownListHighlight;
  private int mDropDownVerticalOffset;
  private boolean mDropDownVerticalOffsetSet;
  private int mDropDownWidth = -2;
  private Handler mHandler = new Handler();
  private final ListSelectorHider mHideSelector = new ListSelectorHider(null);
  private AdapterView.OnItemClickListener mItemClickListener;
  private AdapterView.OnItemSelectedListener mItemSelectedListener;
  private int mListItemExpandMaximum = 2147483647;
  private boolean mModal;
  private DataSetObserver mObserver;
  private PopupWindow mPopup;
  private int mPromptPosition = 0;
  private View mPromptView;
  private final ResizePopupRunnable mResizePopupRunnable = new ResizePopupRunnable(null);
  private final PopupScrollListener mScrollListener = new PopupScrollListener(null);
  private Rect mTempRect = new Rect();
  private final PopupTouchInterceptor mTouchInterceptor = new PopupTouchInterceptor(null);

  public IcsListPopupWindow(Context paramContext)
  {
    this(paramContext, null, R.attr.listPopupWindowStyle);
  }

  public IcsListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this.mContext = paramContext;
    this.mPopup = new PopupWindow(paramContext, paramAttributeSet, paramInt);
    this.mPopup.setInputMethodMode(1);
  }

  public IcsListPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mContext = paramContext;
    if (Build.VERSION.SDK_INT < 11);
    for (this.mPopup = new PopupWindow(new ContextThemeWrapper(paramContext, paramInt2), paramAttributeSet, paramInt1); ; this.mPopup = new PopupWindow(paramContext, paramAttributeSet, paramInt1, paramInt2))
    {
      this.mPopup.setInputMethodMode(1);
      return;
    }
  }

  private int buildDropDown()
  {
    int i = 0;
    boolean bool2;
    Object localObject;
    View localView2;
    LinearLayout localLinearLayout;
    LinearLayout.LayoutParams localLayoutParams2;
    label212: int j;
    label268: boolean bool1;
    label345: int k;
    if (this.mDropDownList == null)
    {
      Context localContext = this.mContext;
      if (this.mModal)
      {
        bool2 = false;
        this.mDropDownList = new DropDownListView(localContext, bool2);
        if (this.mDropDownListHighlight != null)
          this.mDropDownList.setSelector(this.mDropDownListHighlight);
        this.mDropDownList.setAdapter(this.mAdapter);
        this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
        this.mDropDownList.setFocusable(true);
        this.mDropDownList.setFocusableInTouchMode(true);
        this.mDropDownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
          {
            if (paramInt != -1)
            {
              IcsListPopupWindow.DropDownListView localDropDownListView = IcsListPopupWindow.this.mDropDownList;
              if (localDropDownListView != null)
                IcsListPopupWindow.DropDownListView.access$0(localDropDownListView, false);
            }
          }

          public void onNothingSelected(AdapterView<?> paramAdapterView)
          {
          }
        });
        this.mDropDownList.setOnScrollListener(this.mScrollListener);
        if (this.mItemSelectedListener != null)
          this.mDropDownList.setOnItemSelectedListener(this.mItemSelectedListener);
        localObject = this.mDropDownList;
        localView2 = this.mPromptView;
        if (localView2 != null)
        {
          localLinearLayout = new LinearLayout(localContext);
          localLinearLayout.setOrientation(1);
          localLayoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
        }
        switch (this.mPromptPosition)
        {
        default:
          localView2.measure(View.MeasureSpec.makeMeasureSpec(this.mDropDownWidth, -2147483648), 0);
          LinearLayout.LayoutParams localLayoutParams3 = (LinearLayout.LayoutParams)localView2.getLayoutParams();
          i = localView2.getMeasuredHeight() + localLayoutParams3.topMargin + localLayoutParams3.bottomMargin;
          localObject = localLinearLayout;
          this.mPopup.setContentView((View)localObject);
          j = 0;
          Drawable localDrawable = this.mPopup.getBackground();
          if (localDrawable != null)
          {
            localDrawable.getPadding(this.mTempRect);
            j = this.mTempRect.top + this.mTempRect.bottom;
            if (!this.mDropDownVerticalOffsetSet)
              this.mDropDownVerticalOffset = (-this.mTempRect.top);
          }
          if (this.mPopup.getInputMethodMode() != 2)
            break;
          bool1 = true;
          k = getMaxAvailableHeight(this.mDropDownAnchorView, this.mDropDownVerticalOffset, bool1);
          if (this.mDropDownHeight != -1);
        case 1:
        case 0:
        }
      }
    }
    int m;
    for (int n = k + j; ; n = m + i)
    {
      return n;
      bool2 = true;
      break;
      localLinearLayout.addView((View)localObject, localLayoutParams2);
      localLinearLayout.addView(localView2);
      break label212;
      localLinearLayout.addView(localView2);
      localLinearLayout.addView((View)localObject, localLayoutParams2);
      break label212;
      ((ViewGroup)this.mPopup.getContentView());
      View localView1 = this.mPromptView;
      if (localView1 == null)
        break label268;
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
      i = localView1.getMeasuredHeight() + localLayoutParams1.topMargin + localLayoutParams1.bottomMargin;
      break label268;
      bool1 = false;
      break label345;
      m = measureHeightOfChildren(0, 0, -1, k - i, -1);
      if (m <= 0)
        continue;
      i += j;
    }
  }

  private int getMaxAvailableHeight(View paramView, int paramInt, boolean paramBoolean)
  {
    Rect localRect = new Rect();
    paramView.getWindowVisibleDisplayFrame(localRect);
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = localRect.bottom;
    if (paramBoolean)
      i = paramView.getContext().getResources().getDisplayMetrics().heightPixels;
    int j = Math.max(i - (arrayOfInt[1] + paramView.getHeight()) - paramInt, paramInt + (arrayOfInt[1] - localRect.top));
    if (this.mPopup.getBackground() != null)
    {
      this.mPopup.getBackground().getPadding(this.mTempRect);
      j -= this.mTempRect.top + this.mTempRect.bottom;
    }
    return j;
  }

  private boolean isInputMethodNotNeeded()
  {
    if (this.mPopup.getInputMethodMode() == 2);
    for (int i = 1; ; i = 0)
      return i;
  }

  private int measureHeightOfChildren(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ListAdapter localListAdapter = this.mAdapter;
    int k;
    if (localListAdapter == null)
    {
      k = this.mDropDownList.getListPaddingTop() + this.mDropDownList.getListPaddingBottom();
      return k;
    }
    int i = this.mDropDownList.getListPaddingTop() + this.mDropDownList.getListPaddingBottom();
    int j;
    if ((this.mDropDownList.getDividerHeight() > 0) && (this.mDropDownList.getDivider() != null))
    {
      j = this.mDropDownList.getDividerHeight();
      label77: k = 0;
      if (paramInt3 == -1)
        paramInt3 = -1 + localListAdapter.getCount();
    }
    for (int m = paramInt2; ; m++)
    {
      if (m > paramInt3)
      {
        k = i;
        break;
        j = 0;
        break label77;
      }
      View localView = this.mAdapter.getView(m, null, this.mDropDownList);
      if (this.mDropDownList.getCacheColorHint() != 0)
        localView.setDrawingCacheBackgroundColor(this.mDropDownList.getCacheColorHint());
      measureScrapChild(localView, m, paramInt1);
      if (m > 0)
        i += j;
      i += localView.getMeasuredHeight();
      if (i >= paramInt4)
      {
        if ((paramInt5 >= 0) && (m > paramInt5) && (k > 0) && (i != paramInt4))
          break;
        k = paramInt4;
        break;
      }
      if ((paramInt5 < 0) || (m < paramInt5))
        continue;
      k = i;
    }
  }

  private void measureScrapChild(View paramView, int paramInt1, int paramInt2)
  {
    AbsListView.LayoutParams localLayoutParams = (AbsListView.LayoutParams)paramView.getLayoutParams();
    if (localLayoutParams == null)
    {
      localLayoutParams = new AbsListView.LayoutParams(-1, -2, 0);
      paramView.setLayoutParams(localLayoutParams);
    }
    int i = ViewGroup.getChildMeasureSpec(paramInt2, this.mDropDownList.getPaddingLeft() + this.mDropDownList.getPaddingRight(), localLayoutParams.width);
    int j = localLayoutParams.height;
    if (j > 0);
    for (int k = View.MeasureSpec.makeMeasureSpec(j, 1073741824); ; k = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i, k);
      return;
    }
  }

  public void clearListSelection()
  {
    DropDownListView localDropDownListView = this.mDropDownList;
    if (localDropDownListView != null)
    {
      localDropDownListView.mListSelectionHidden = true;
      localDropDownListView.requestLayout();
    }
  }

  public void dismiss()
  {
    this.mPopup.dismiss();
    if (this.mPromptView != null)
    {
      ViewParent localViewParent = this.mPromptView.getParent();
      if ((localViewParent instanceof ViewGroup))
        ((ViewGroup)localViewParent).removeView(this.mPromptView);
    }
    this.mPopup.setContentView(null);
    this.mDropDownList = null;
    this.mHandler.removeCallbacks(this.mResizePopupRunnable);
  }

  public ListView getListView()
  {
    return this.mDropDownList;
  }

  public boolean isShowing()
  {
    return this.mPopup.isShowing();
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.mObserver == null)
      this.mObserver = new PopupDataSetObserver(null);
    while (true)
    {
      this.mAdapter = paramListAdapter;
      if (this.mAdapter != null)
        paramListAdapter.registerDataSetObserver(this.mObserver);
      if (this.mDropDownList != null)
        this.mDropDownList.setAdapter(this.mAdapter);
      return;
      if (this.mAdapter == null)
        continue;
      this.mAdapter.unregisterDataSetObserver(this.mObserver);
    }
  }

  public void setAnchorView(View paramView)
  {
    this.mDropDownAnchorView = paramView;
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.mPopup.setBackgroundDrawable(paramDrawable);
  }

  public void setContentWidth(int paramInt)
  {
    Drawable localDrawable = this.mPopup.getBackground();
    if (localDrawable != null)
      localDrawable.getPadding(this.mTempRect);
    for (this.mDropDownWidth = (paramInt + (this.mTempRect.left + this.mTempRect.right)); ; this.mDropDownWidth = paramInt)
      return;
  }

  public void setHorizontalOffset(int paramInt)
  {
    this.mDropDownHorizontalOffset = paramInt;
  }

  public void setInputMethodMode(int paramInt)
  {
    this.mPopup.setInputMethodMode(paramInt);
  }

  public void setModal(boolean paramBoolean)
  {
    this.mModal = true;
    this.mPopup.setFocusable(paramBoolean);
  }

  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mPopup.setOnDismissListener(paramOnDismissListener);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.mItemClickListener = paramOnItemClickListener;
  }

  public void setPromptPosition(int paramInt)
  {
    this.mPromptPosition = paramInt;
  }

  public void setVerticalOffset(int paramInt)
  {
    this.mDropDownVerticalOffset = paramInt;
    this.mDropDownVerticalOffsetSet = true;
  }

  public void show()
  {
    int i = 0;
    int j = -1;
    int k = buildDropDown();
    int m = 0;
    int n = 0;
    boolean bool = isInputMethodNotNeeded();
    if (this.mPopup.isShowing())
    {
      int i1;
      int i2;
      if (this.mDropDownWidth == j)
      {
        i1 = -1;
        if (this.mDropDownHeight != j)
          break label185;
        if (!bool)
          break label148;
        i2 = k;
        label60: if (!bool)
          break label159;
        PopupWindow localPopupWindow2 = this.mPopup;
        if (this.mDropDownWidth != j)
          break label154;
        label79: localPopupWindow2.setWindowLayoutMode(j, 0);
      }
      while (true)
      {
        this.mPopup.setOutsideTouchable(true);
        this.mPopup.update(this.mDropDownAnchorView, this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, i1, i2);
        return;
        if (this.mDropDownWidth == -2)
        {
          i1 = this.mDropDownAnchorView.getWidth();
          break;
        }
        i1 = this.mDropDownWidth;
        break;
        label148: i2 = j;
        break label60;
        label154: j = 0;
        break label79;
        label159: PopupWindow localPopupWindow1 = this.mPopup;
        if (this.mDropDownWidth == j)
          i = j;
        localPopupWindow1.setWindowLayoutMode(i, j);
        continue;
        label185: if (this.mDropDownHeight == -2)
        {
          i2 = k;
          continue;
        }
        i2 = this.mDropDownHeight;
      }
    }
    if (this.mDropDownWidth == j)
    {
      m = -1;
      label221: if (this.mDropDownHeight != j)
        break label373;
      n = -1;
    }
    while (true)
    {
      this.mPopup.setWindowLayoutMode(m, n);
      this.mPopup.setOutsideTouchable(true);
      this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
      this.mPopup.showAsDropDown(this.mDropDownAnchorView, this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset);
      this.mDropDownList.setSelection(j);
      if ((!this.mModal) || (this.mDropDownList.isInTouchMode()))
        clearListSelection();
      if (this.mModal)
        break;
      this.mHandler.post(this.mHideSelector);
      break;
      if (this.mDropDownWidth == -2)
      {
        this.mPopup.setWidth(this.mDropDownAnchorView.getWidth());
        break label221;
      }
      this.mPopup.setWidth(this.mDropDownWidth);
      break label221;
      label373: if (this.mDropDownHeight == -2)
      {
        this.mPopup.setHeight(k);
        continue;
      }
      this.mPopup.setHeight(this.mDropDownHeight);
    }
  }

  private static class DropDownListView extends ListView
  {
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;

    public DropDownListView(Context paramContext, boolean paramBoolean)
    {
      super(null, R.attr.dropDownListViewStyle);
      this.mHijackFocus = paramBoolean;
      setCacheColorHint(0);
    }

    public boolean hasFocus()
    {
      if ((!this.mHijackFocus) && (!super.hasFocus()));
      for (int i = 0; ; i = 1)
        return i;
    }

    public boolean hasWindowFocus()
    {
      if ((!this.mHijackFocus) && (!super.hasWindowFocus()));
      for (int i = 0; ; i = 1)
        return i;
    }

    public boolean isFocused()
    {
      if ((!this.mHijackFocus) && (!super.isFocused()));
      for (int i = 0; ; i = 1)
        return i;
    }

    public boolean isInTouchMode()
    {
      if (((!this.mHijackFocus) || (!this.mListSelectionHidden)) && (!super.isInTouchMode()));
      for (int i = 0; ; i = 1)
        return i;
    }
  }

  private class ListSelectorHider
    implements Runnable
  {
    private ListSelectorHider()
    {
    }

    public void run()
    {
      IcsListPopupWindow.this.clearListSelection();
    }
  }

  private class PopupDataSetObserver extends DataSetObserver
  {
    private PopupDataSetObserver()
    {
    }

    public void onChanged()
    {
      if (IcsListPopupWindow.this.isShowing())
        IcsListPopupWindow.this.show();
    }

    public void onInvalidated()
    {
      IcsListPopupWindow.this.dismiss();
    }
  }

  private class PopupScrollListener
    implements AbsListView.OnScrollListener
  {
    private PopupScrollListener()
    {
    }

    public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
    {
    }

    public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
    {
      if ((paramInt == 1) && (!IcsListPopupWindow.this.isInputMethodNotNeeded()) && (IcsListPopupWindow.this.mPopup.getContentView() != null))
      {
        IcsListPopupWindow.this.mHandler.removeCallbacks(IcsListPopupWindow.this.mResizePopupRunnable);
        IcsListPopupWindow.this.mResizePopupRunnable.run();
      }
    }
  }

  private class PopupTouchInterceptor
    implements View.OnTouchListener
  {
    private PopupTouchInterceptor()
    {
    }

    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      int i = paramMotionEvent.getAction();
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      if ((i == 0) && (IcsListPopupWindow.this.mPopup != null) && (IcsListPopupWindow.this.mPopup.isShowing()) && (j >= 0) && (j < IcsListPopupWindow.this.mPopup.getWidth()) && (k >= 0) && (k < IcsListPopupWindow.this.mPopup.getHeight()))
        IcsListPopupWindow.this.mHandler.postDelayed(IcsListPopupWindow.this.mResizePopupRunnable, 250L);
      while (true)
      {
        return false;
        if (i != 1)
          continue;
        IcsListPopupWindow.this.mHandler.removeCallbacks(IcsListPopupWindow.this.mResizePopupRunnable);
      }
    }
  }

  private class ResizePopupRunnable
    implements Runnable
  {
    private ResizePopupRunnable()
    {
    }

    public void run()
    {
      if ((IcsListPopupWindow.this.mDropDownList != null) && (IcsListPopupWindow.this.mDropDownList.getCount() > IcsListPopupWindow.this.mDropDownList.getChildCount()) && (IcsListPopupWindow.this.mDropDownList.getChildCount() <= IcsListPopupWindow.this.mListItemExpandMaximum))
      {
        IcsListPopupWindow.this.mPopup.setInputMethodMode(2);
        IcsListPopupWindow.this.show();
      }
    }
  }
}

/* Location:           D:\MySoftware\decomp\classes_dex2jar.jar
 * Qualified Name:     com.actionbarsherlock.internal.widget.IcsListPopupWindow
 * JD-Core Version:    0.6.0
 */