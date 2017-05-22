// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.main.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainFragment$$ViewBinder<T extends com.xiecc.seeWeather.modules.main.ui.MainFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820765, "field 'mIvError'");
    target.mIvError = finder.castView(view, 2131820765, "field 'mIvError'");
    view = finder.findRequiredView(source, 2131820694, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131820694, "field 'mProgressBar'");
    view = finder.findRequiredView(source, 2131820678, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131820678, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131820665, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131820665, "field 'mRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.mIvError = null;
    target.mProgressBar = null;
    target.mRefreshLayout = null;
    target.mRecyclerView = null;
  }
}
