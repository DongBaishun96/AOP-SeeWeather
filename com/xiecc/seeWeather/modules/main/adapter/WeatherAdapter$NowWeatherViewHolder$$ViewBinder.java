// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.main.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class WeatherAdapter$NowWeatherViewHolder$$ViewBinder<T extends com.xiecc.seeWeather.modules.main.adapter.WeatherAdapter.NowWeatherViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820728, "field 'tempMax'");
    target.tempMax = finder.castView(view, 2131820728, "field 'tempMax'");
    view = finder.findRequiredView(source, 2131820704, "field 'cardView'");
    target.cardView = finder.castView(view, 2131820704, "field 'cardView'");
    view = finder.findRequiredView(source, 2131820726, "field 'tempFlu'");
    target.tempFlu = finder.castView(view, 2131820726, "field 'tempFlu'");
    view = finder.findRequiredView(source, 2131820729, "field 'tempMin'");
    target.tempMin = finder.castView(view, 2131820729, "field 'tempMin'");
    view = finder.findRequiredView(source, 2131820731, "field 'tempQuality'");
    target.tempQuality = finder.castView(view, 2131820731, "field 'tempQuality'");
    view = finder.findRequiredView(source, 2131820724, "field 'weatherIcon'");
    target.weatherIcon = finder.castView(view, 2131820724, "field 'weatherIcon'");
    view = finder.findRequiredView(source, 2131820730, "field 'tempPm'");
    target.tempPm = finder.castView(view, 2131820730, "field 'tempPm'");
  }

  @Override public void unbind(T target) {
    target.tempMax = null;
    target.cardView = null;
    target.tempFlu = null;
    target.tempMin = null;
    target.tempQuality = null;
    target.weatherIcon = null;
    target.tempPm = null;
  }
}
