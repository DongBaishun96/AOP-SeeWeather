// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.main.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WeatherAdapter$SuggestionViewHolder$$ViewBinder<T extends com.xiecc.seeWeather.modules.main.adapter.WeatherAdapter.SuggestionViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820716, "field 'clothBrief'");
    target.clothBrief = finder.castView(view, 2131820716, "field 'clothBrief'");
    view = finder.findRequiredView(source, 2131820717, "field 'clothTxt'");
    target.clothTxt = finder.castView(view, 2131820717, "field 'clothTxt'");
    view = finder.findRequiredView(source, 2131820720, "field 'travelBrief'");
    target.travelBrief = finder.castView(view, 2131820720, "field 'travelBrief'");
    view = finder.findRequiredView(source, 2131820723, "field 'fluTxt'");
    target.fluTxt = finder.castView(view, 2131820723, "field 'fluTxt'");
    view = finder.findRequiredView(source, 2131820722, "field 'fluBrief'");
    target.fluBrief = finder.castView(view, 2131820722, "field 'fluBrief'");
    view = finder.findRequiredView(source, 2131820718, "field 'sportBrief'");
    target.sportBrief = finder.castView(view, 2131820718, "field 'sportBrief'");
    view = finder.findRequiredView(source, 2131820721, "field 'travelTxt'");
    target.travelTxt = finder.castView(view, 2131820721, "field 'travelTxt'");
    view = finder.findRequiredView(source, 2131820719, "field 'sportTxt'");
    target.sportTxt = finder.castView(view, 2131820719, "field 'sportTxt'");
  }

  @Override public void unbind(T target) {
    target.clothBrief = null;
    target.clothTxt = null;
    target.travelBrief = null;
    target.fluTxt = null;
    target.fluBrief = null;
    target.sportBrief = null;
    target.travelTxt = null;
    target.sportTxt = null;
  }
}
