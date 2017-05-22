// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.main.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.xiecc.seeWeather.modules.main.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820667, "field 'mViewPager'");
    target.mViewPager = finder.castView(view, 2131820667, "field 'mViewPager'");
    view = finder.findRequiredView(source, 2131820668, "field 'mFab'");
    target.mFab = finder.castView(view, 2131820668, "field 'mFab'");
    view = finder.findRequiredView(source, 2131820669, "field 'mNavView'");
    target.mNavView = finder.castView(view, 2131820669, "field 'mNavView'");
    view = finder.findRequiredView(source, 2131820664, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131820664, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131820763, "field 'mTabLayout'");
    target.mTabLayout = finder.castView(view, 2131820763, "field 'mTabLayout'");
    view = finder.findRequiredView(source, 2131820666, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131820666, "field 'mDrawerLayout'");
  }

  @Override public void unbind(T target) {
    target.mViewPager = null;
    target.mFab = null;
    target.mNavView = null;
    target.mToolbar = null;
    target.mTabLayout = null;
    target.mDrawerLayout = null;
  }
}
