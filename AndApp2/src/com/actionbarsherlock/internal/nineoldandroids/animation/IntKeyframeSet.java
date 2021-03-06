package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

class IntKeyframeSet extends KeyframeSet
{
  private int deltaValue;
  private boolean firstTime = true;
  private int firstValue;
  private int lastValue;

  public IntKeyframeSet(Keyframe.IntKeyframe[] paramArrayOfIntKeyframe)
  {
    super(paramArrayOfIntKeyframe);
  }

  public IntKeyframeSet clone()
  {
    ArrayList localArrayList = this.mKeyframes;
    int i = this.mKeyframes.size();
    Keyframe.IntKeyframe[] arrayOfIntKeyframe = new Keyframe.IntKeyframe[i];
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return new IntKeyframeSet(arrayOfIntKeyframe);
      arrayOfIntKeyframe[j] = ((Keyframe.IntKeyframe)((Keyframe)localArrayList.get(j)).clone());
    }
  }

  public int getIntValue(float paramFloat)
  {
    int m;
    if (this.mNumKeyframes == 2)
    {
      if (this.firstTime)
      {
        this.firstTime = false;
        this.firstValue = ((Keyframe.IntKeyframe)this.mKeyframes.get(0)).getIntValue();
        this.lastValue = ((Keyframe.IntKeyframe)this.mKeyframes.get(1)).getIntValue();
        this.deltaValue = (this.lastValue - this.firstValue);
      }
      if (this.mInterpolator != null)
        paramFloat = this.mInterpolator.getInterpolation(paramFloat);
      if (this.mEvaluator == null)
        m = this.firstValue + (int)(paramFloat * this.deltaValue);
    }
    while (true)
    {
      return m;
      m = ((Number)this.mEvaluator.evaluate(paramFloat, Integer.valueOf(this.firstValue), Integer.valueOf(this.lastValue))).intValue();
      continue;
      if (paramFloat <= 0.0F)
      {
        Keyframe.IntKeyframe localIntKeyframe4 = (Keyframe.IntKeyframe)this.mKeyframes.get(0);
        Keyframe.IntKeyframe localIntKeyframe5 = (Keyframe.IntKeyframe)this.mKeyframes.get(1);
        int i2 = localIntKeyframe4.getIntValue();
        int i3 = localIntKeyframe5.getIntValue();
        float f5 = localIntKeyframe4.getFraction();
        float f6 = localIntKeyframe5.getFraction();
        Interpolator localInterpolator3 = localIntKeyframe5.getInterpolator();
        if (localInterpolator3 != null)
          paramFloat = localInterpolator3.getInterpolation(paramFloat);
        float f7 = (paramFloat - f5) / (f6 - f5);
        if (this.mEvaluator == null)
        {
          m = i2 + (int)(f7 * (i3 - i2));
          continue;
        }
        m = ((Number)this.mEvaluator.evaluate(f7, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
        continue;
      }
      if (paramFloat < 1.0F)
        break;
      Keyframe.IntKeyframe localIntKeyframe2 = (Keyframe.IntKeyframe)this.mKeyframes.get(-2 + this.mNumKeyframes);
      Keyframe.IntKeyframe localIntKeyframe3 = (Keyframe.IntKeyframe)this.mKeyframes.get(-1 + this.mNumKeyframes);
      int n = localIntKeyframe2.getIntValue();
      int i1 = localIntKeyframe3.getIntValue();
      float f2 = localIntKeyframe2.getFraction();
      float f3 = localIntKeyframe3.getFraction();
      Interpolator localInterpolator2 = localIntKeyframe3.getInterpolator();
      if (localInterpolator2 != null)
        paramFloat = localInterpolator2.getInterpolation(paramFloat);
      float f4 = (paramFloat - f2) / (f3 - f2);
      if (this.mEvaluator == null)
      {
        m = n + (int)(f4 * (i1 - n));
        continue;
      }
      m = ((Number)this.mEvaluator.evaluate(f4, Integer.valueOf(n), Integer.valueOf(i1))).intValue();
    }
    Object localObject = (Keyframe.IntKeyframe)this.mKeyframes.get(0);
    for (int i = 1; ; i++)
    {
      if (i >= this.mNumKeyframes)
      {
        m = ((Number)((Keyframe)this.mKeyframes.get(-1 + this.mNumKeyframes)).getValue()).intValue();
        break;
      }
      Keyframe.IntKeyframe localIntKeyframe1 = (Keyframe.IntKeyframe)this.mKeyframes.get(i);
      if (paramFloat < localIntKeyframe1.getFraction())
      {
        Interpolator localInterpolator1 = localIntKeyframe1.getInterpolator();
        if (localInterpolator1 != null)
          paramFloat = localInterpolator1.getInterpolation(paramFloat);
        float f1 = (paramFloat - ((Keyframe.IntKeyframe)localObject).getFraction()) / (localIntKeyframe1.getFraction() - ((Keyframe.IntKeyframe)localObject).getFraction());
        int j = ((Keyframe.IntKeyframe)localObject).getIntValue();
        int k = localIntKeyframe1.getIntValue();
        if (this.mEvaluator == null)
        {
          m = j + (int)(f1 * (k - j));
          break;
        }
        m = ((Number)this.mEvaluator.evaluate(f1, Integer.valueOf(j), Integer.valueOf(k))).intValue();
        break;
      }
      localObject = localIntKeyframe1;
    }
  }

  public Object getValue(float paramFloat)
  {
    return Integer.valueOf(getIntValue(paramFloat));
  }
}

/* Location:           D:\MySoftware\decomp\classes_dex2jar.jar
 * Qualified Name:     com.actionbarsherlock.internal.nineoldandroids.animation.IntKeyframeSet
 * JD-Core Version:    0.6.0
 */