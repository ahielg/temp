package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class FragmentActivity extends Activity
{
  private static final String FRAGMENTS_TAG = "android:support:fragments";
  private static final int HONEYCOMB = 11;
  static final int MSG_REALLY_STOPPED = 1;
  static final int MSG_RESUME_PENDING = 2;
  private static final String TAG = "FragmentActivity";
  HCSparseArray<LoaderManagerImpl> mAllLoaderManagers;
  boolean mCheckedForLoaderManager;
  boolean mCreated;
  final FragmentManagerImpl mFragments = new FragmentManagerImpl();
  final Handler mHandler = new Handler()
  {
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default:
        super.handleMessage(paramMessage);
      case 1:
      case 2:
      }
      while (true)
      {
        return;
        if (!FragmentActivity.this.mStopped)
          continue;
        FragmentActivity.this.doReallyStop(false);
        continue;
        FragmentActivity.this.mFragments.dispatchResume();
        FragmentActivity.this.mFragments.execPendingActions();
      }
    }
  };
  LoaderManagerImpl mLoaderManager;
  boolean mLoadersStarted;
  boolean mOptionsMenuInvalidated;
  boolean mReallyStopped;
  boolean mResumed;
  boolean mRetaining;
  boolean mStopped;

  void doReallyStop(boolean paramBoolean)
  {
    if (!this.mReallyStopped)
    {
      this.mReallyStopped = true;
      this.mRetaining = paramBoolean;
      this.mHandler.removeMessages(1);
      onReallyStop();
    }
  }

  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if (Build.VERSION.SDK_INT >= 11);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.mCreated);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.mStopped);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.mReallyStopped);
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.mLoadersStarted);
    if (this.mLoaderManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
      paramPrintWriter.println(":");
      this.mLoaderManager.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.mFragments.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }

  public Object getLastCustomNonConfigurationInstance()
  {
    NonConfigurationInstances localNonConfigurationInstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
    if (localNonConfigurationInstances != null);
    for (Object localObject = localNonConfigurationInstances.custom; ; localObject = null)
      return localObject;
  }

  LoaderManagerImpl getLoaderManager(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.mAllLoaderManagers == null)
      this.mAllLoaderManagers = new HCSparseArray();
    LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)this.mAllLoaderManagers.get(paramInt);
    if (localLoaderManagerImpl == null)
      if (paramBoolean2)
      {
        localLoaderManagerImpl = new LoaderManagerImpl(this, paramBoolean1);
        this.mAllLoaderManagers.put(paramInt, localLoaderManagerImpl);
      }
    while (true)
    {
      return localLoaderManagerImpl;
      localLoaderManagerImpl.updateActivity(this);
    }
  }

  public FragmentManager getSupportFragmentManager()
  {
    return this.mFragments;
  }

  public LoaderManager getSupportLoaderManager()
  {
    if (this.mLoaderManager != null);
    for (LoaderManagerImpl localLoaderManagerImpl = this.mLoaderManager; ; localLoaderManagerImpl = this.mLoaderManager)
    {
      return localLoaderManagerImpl;
      this.mCheckedForLoaderManager = true;
      this.mLoaderManager = getLoaderManager(-1, this.mLoadersStarted, true);
    }
  }

  void invalidateSupportFragmentIndex(int paramInt)
  {
    if (this.mAllLoaderManagers != null)
    {
      LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)this.mAllLoaderManagers.get(paramInt);
      if ((localLoaderManagerImpl != null) && (!localLoaderManagerImpl.mRetaining))
      {
        localLoaderManagerImpl.doDestroy();
        this.mAllLoaderManagers.remove(paramInt);
      }
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = paramInt1 >> 16;
    int j;
    if (i != 0)
    {
      j = i - 1;
      if ((this.mFragments.mActive == null) || (j < 0) || (j >= this.mFragments.mActive.size()))
        Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(paramInt1));
    }
    while (true)
    {
      return;
      Fragment localFragment = (Fragment)this.mFragments.mActive.get(j);
      if (localFragment == null)
        Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(paramInt1));
      localFragment.onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      continue;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }

  public void onAttachFragment(Fragment paramFragment)
  {
  }

  public void onBackPressed()
  {
    if (!this.mFragments.popBackStackImmediate())
      finish();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.mFragments.dispatchConfigurationChanged(paramConfiguration);
  }

  protected void onCreate(Bundle paramBundle)
  {
    this.mFragments.attachActivity(this);
    if (getLayoutInflater().getFactory() == null)
      getLayoutInflater().setFactory(this);
    super.onCreate(paramBundle);
    NonConfigurationInstances localNonConfigurationInstances = (NonConfigurationInstances)getLastNonConfigurationInstance();
    if (localNonConfigurationInstances != null)
      this.mAllLoaderManagers = localNonConfigurationInstances.loaders;
    Parcelable localParcelable;
    FragmentManagerImpl localFragmentManagerImpl;
    if (paramBundle != null)
    {
      localParcelable = paramBundle.getParcelable("android:support:fragments");
      localFragmentManagerImpl = this.mFragments;
      if (localNonConfigurationInstances == null)
        break label94;
    }
    label94: for (ArrayList localArrayList = localNonConfigurationInstances.fragments; ; localArrayList = null)
    {
      localFragmentManagerImpl.restoreAllState(localParcelable, localArrayList);
      this.mFragments.dispatchCreate();
      return;
    }
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    boolean bool;
    if (paramInt == 0)
    {
      bool = super.onCreatePanelMenu(paramInt, paramMenu) | this.mFragments.dispatchCreateOptionsMenu(paramMenu, getMenuInflater());
      if (Build.VERSION.SDK_INT < 11);
    }
    while (true)
    {
      return bool;
      bool = true;
      continue;
      bool = super.onCreatePanelMenu(paramInt, paramMenu);
    }
  }

  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Fragment localFragment = null;
    int i = 0;
    if (!"fragment".equals(paramString));
    for (View localView = super.onCreateView(paramString, paramContext, paramAttributeSet); ; localView = localFragment.mView)
    {
      return localView;
      String str1 = paramAttributeSet.getAttributeValue(null, "class");
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, FragmentTag.Fragment);
      if (str1 == null)
        str1 = localTypedArray.getString(0);
      int j = localTypedArray.getResourceId(1, -1);
      String str2 = localTypedArray.getString(2);
      localTypedArray.recycle();
      if (0 != 0)
        i = null.getId();
      if ((i == -1) && (j == -1) && (str2 == null))
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      if (j != -1)
        localFragment = this.mFragments.findFragmentById(j);
      if ((localFragment == null) && (str2 != null))
        localFragment = this.mFragments.findFragmentByTag(str2);
      if ((localFragment == null) && (i != -1))
        localFragment = this.mFragments.findFragmentById(i);
      if (FragmentManagerImpl.DEBUG)
        Log.v("FragmentActivity", "onCreateView: id=0x" + Integer.toHexString(j) + " fname=" + str1 + " existing=" + localFragment);
      int k;
      if (localFragment == null)
      {
        localFragment = Fragment.instantiate(this, str1);
        localFragment.mFromLayout = true;
        if (j != 0)
        {
          k = j;
          localFragment.mFragmentId = k;
          localFragment.mContainerId = i;
          localFragment.mTag = str2;
          localFragment.mInLayout = true;
          localFragment.mFragmentManager = this.mFragments;
          localFragment.onInflate(this, paramAttributeSet, localFragment.mSavedFragmentState);
          this.mFragments.addFragment(localFragment, true);
        }
      }
      while (true)
      {
        if (localFragment.mView != null)
          break label532;
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        k = i;
        break;
        if (localFragment.mInLayout)
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(j) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + str1);
        localFragment.mInLayout = true;
        if (!localFragment.mRetaining)
          localFragment.onInflate(this, paramAttributeSet, localFragment.mSavedFragmentState);
        this.mFragments.moveToState(localFragment);
      }
      label532: if (j != 0)
        localFragment.mView.setId(j);
      if (localFragment.mView.getTag() != null)
        continue;
      localFragment.mView.setTag(str2);
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    doReallyStop(false);
    this.mFragments.dispatchDestroy();
    if (this.mLoaderManager != null)
      this.mLoaderManager.doDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
      onBackPressed();
    for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  public void onLowMemory()
  {
    super.onLowMemory();
    this.mFragments.dispatchLowMemory();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool;
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      bool = true;
    while (true)
    {
      return bool;
      switch (paramInt)
      {
      default:
        bool = false;
        break;
      case 0:
        bool = this.mFragments.dispatchOptionsItemSelected(paramMenuItem);
        break;
      case 6:
        bool = this.mFragments.dispatchContextItemSelected(paramMenuItem);
      }
    }
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.mFragments.dispatchOptionsMenuClosed(paramMenu);
    }
  }

  protected void onPause()
  {
    super.onPause();
    this.mResumed = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      this.mFragments.dispatchResume();
    }
    this.mFragments.dispatchPause();
  }

  protected void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    this.mFragments.dispatchResume();
    this.mFragments.execPendingActions();
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = false;
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.mOptionsMenuInvalidated)
      {
        this.mOptionsMenuInvalidated = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      if ((!(super.onPreparePanel(paramInt, paramView, paramMenu) | this.mFragments.dispatchPrepareOptionsMenu(paramMenu))) || (!paramMenu.hasVisibleItems()));
    }
    for (bool = true; ; bool = super.onPreparePanel(paramInt, paramView, paramMenu))
      return bool;
  }

  void onReallyStop()
  {
    if (this.mLoadersStarted)
    {
      this.mLoadersStarted = false;
      if (this.mLoaderManager != null)
      {
        if (this.mRetaining)
          break label41;
        this.mLoaderManager.doStop();
      }
    }
    while (true)
    {
      this.mFragments.dispatchReallyStop();
      return;
      label41: this.mLoaderManager.doRetain();
    }
  }

  protected void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.mResumed = true;
    this.mFragments.execPendingActions();
  }

  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }

  public final Object onRetainNonConfigurationInstance()
  {
    if (this.mStopped)
      doReallyStop(true);
    Object localObject = onRetainCustomNonConfigurationInstance();
    ArrayList localArrayList = this.mFragments.retainNonConfig();
    int i = 0;
    if (this.mAllLoaderManagers != null)
    {
      int j = -1 + this.mAllLoaderManagers.size();
      if (j >= 0)
      {
        LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)this.mAllLoaderManagers.valueAt(j);
        if (localLoaderManagerImpl.mRetaining)
          i = 1;
        while (true)
        {
          j--;
          break;
          localLoaderManagerImpl.doDestroy();
          this.mAllLoaderManagers.removeAt(j);
        }
      }
    }
    NonConfigurationInstances localNonConfigurationInstances;
    if ((localArrayList == null) && (i == 0) && (localObject == null))
      localNonConfigurationInstances = null;
    while (true)
    {
      return localNonConfigurationInstances;
      localNonConfigurationInstances = new NonConfigurationInstances();
      localNonConfigurationInstances.activity = null;
      localNonConfigurationInstances.custom = localObject;
      localNonConfigurationInstances.children = null;
      localNonConfigurationInstances.fragments = localArrayList;
      localNonConfigurationInstances.loaders = this.mAllLoaderManagers;
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Parcelable localParcelable = this.mFragments.saveAllState();
    if (localParcelable != null)
      paramBundle.putParcelable("android:support:fragments", localParcelable);
  }

  protected void onStart()
  {
    super.onStart();
    this.mStopped = false;
    this.mReallyStopped = false;
    this.mHandler.removeMessages(1);
    if (!this.mCreated)
    {
      this.mCreated = true;
      this.mFragments.dispatchActivityCreated();
    }
    this.mFragments.noteStateNotSaved();
    this.mFragments.execPendingActions();
    if (!this.mLoadersStarted)
    {
      this.mLoadersStarted = true;
      if (this.mLoaderManager == null)
        break label142;
      this.mLoaderManager.doStart();
    }
    while (true)
    {
      this.mCheckedForLoaderManager = true;
      this.mFragments.dispatchStart();
      if (this.mAllLoaderManagers == null)
        break;
      for (int i = -1 + this.mAllLoaderManagers.size(); i >= 0; i--)
      {
        LoaderManagerImpl localLoaderManagerImpl = (LoaderManagerImpl)this.mAllLoaderManagers.valueAt(i);
        localLoaderManagerImpl.finishRetain();
        localLoaderManagerImpl.doReportStart();
      }
      label142: if (this.mCheckedForLoaderManager)
        continue;
      this.mLoaderManager = getLoaderManager(-1, this.mLoadersStarted, false);
    }
  }

  protected void onStop()
  {
    super.onStop();
    this.mStopped = true;
    this.mHandler.sendEmptyMessage(1);
    this.mFragments.dispatchStop();
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((paramInt != -1) && ((0xFFFF0000 & paramInt) != 0))
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    super.startActivityForResult(paramIntent, paramInt);
  }

  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt == -1)
      super.startActivityForResult(paramIntent, -1);
    while (true)
    {
      return;
      if ((0xFFFF0000 & paramInt) != 0)
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
      super.startActivityForResult(paramIntent, (1 + paramFragment.mIndex << 16) + (0xFFFF & paramInt));
    }
  }

  public void supportInvalidateOptionsMenu()
  {
    if (Build.VERSION.SDK_INT >= 11)
      ActivityCompatHoneycomb.invalidateOptionsMenu(this);
    while (true)
    {
      return;
      this.mOptionsMenuInvalidated = true;
    }
  }

  static class FragmentTag
  {
    public static final int[] Fragment;
    public static final int Fragment_id = 1;
    public static final int Fragment_name = 0;
    public static final int Fragment_tag = 2;

    static
    {
      int[] arrayOfInt = new int[3];
      arrayOfInt[0] = 16842755;
      arrayOfInt[1] = 16842960;
      arrayOfInt[2] = 16842961;
      Fragment = arrayOfInt;
    }
  }

  static final class NonConfigurationInstances
  {
    Object activity;
    HashMap<String, Object> children;
    Object custom;
    ArrayList<Fragment> fragments;
    HCSparseArray<LoaderManagerImpl> loaders;
  }
}

/* Location:           D:\MySoftware\decomp\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentActivity
 * JD-Core Version:    0.6.0
 */