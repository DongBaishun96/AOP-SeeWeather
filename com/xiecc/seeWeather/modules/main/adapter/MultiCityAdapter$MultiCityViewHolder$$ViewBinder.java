// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.main.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MultiCityAdapter$MultiCityViewHolder$$ViewBinder<T extends com.xiecc.seeWeather.modules.main.adapter.MultiCityAdapter.MultiCityViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820772, "field 'mDialogCity'");
    target.mDialogCity = finder.castView(view, 2131820772, "field 'mDialogCity'");
    view = finder.findRequiredView(source, 2131820774, "field 'mDialogTemp'");
    target.mDialogTemp = finder.castView(view, 2131820774, "field 'mDialogTemp'");
    view = finder.findRequiredView(source, 2131820704, "field 'mCardView'");
    target.mCardView = finder.castView(view, 2131820704, "field 'mCardView'");
    view = finder.findRequiredView(source, 2131820773, "field 'mDialogIcon'");
    target.mDialogIcon = finder.castView(view, 2131820773, "field 'mDialogIcon'");
  }

  @Override public void unbind(T target) {
    target.mDialogCity = null;
    target.mDialogTemp = null;
    target.mCardView = null;
    target.mDialogIcon = null;
  }
}
