// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.main.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MultiCityFragment$$ViewBinder<T extends com.xiecc.seeWeather.modules.main.ui.MultiCityFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820665, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131820665, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131820678, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131820678, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131820692, "field 'mLayout'");
    target.mLayout = finder.castView(view, 2131820692, "field 'mLayout'");
  }

  @Override public void unbind(T target) {
    target.mRecyclerView = null;
    target.mRefreshLayout = null;
    target.mLayout = null;
  }
}
