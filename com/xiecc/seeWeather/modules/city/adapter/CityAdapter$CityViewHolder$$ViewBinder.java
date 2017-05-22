// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.city.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CityAdapter$CityViewHolder$$ViewBinder<T extends com.xiecc.seeWeather.modules.city.adapter.CityAdapter.CityViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820705, "field 'mItemCity'");
    target.mItemCity = finder.castView(view, 2131820705, "field 'mItemCity'");
    view = finder.findRequiredView(source, 2131820704, "field 'mCardView'");
    target.mCardView = finder.castView(view, 2131820704, "field 'mCardView'");
  }

  @Override public void unbind(T target) {
    target.mItemCity = null;
    target.mCardView = null;
  }
}
