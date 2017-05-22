// Generated code from Butter Knife. Do not modify!
package com.xiecc.seeWeather.modules.about.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutActivity$$ViewBinder<T extends com.xiecc.seeWeather.modules.about.ui.AboutActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820661, "field 'mToolbarLayout'");
    target.mToolbarLayout = finder.castView(view, 2131820661, "field 'mToolbarLayout'");
    view = finder.findRequiredView(source, 2131820761, "field 'mBtBug' and method 'onClick'");
    target.mBtBug = finder.castView(view, 2131820761, "field 'mBtBug'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131820756, "field 'mBtCode' and method 'onClick'");
    target.mBtCode = finder.castView(view, 2131820756, "field 'mBtCode'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131820759, "field 'mBtShare' and method 'onClick'");
    target.mBtShare = finder.castView(view, 2131820759, "field 'mBtShare'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131820663, "field 'mTvVersion'");
    target.mTvVersion = finder.castView(view, 2131820663, "field 'mTvVersion'");
    view = finder.findRequiredView(source, 2131820758, "field 'mBtPay' and method 'onClick'");
    target.mBtPay = finder.castView(view, 2131820758, "field 'mBtPay'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131820757, "field 'mBtBlog' and method 'onClick'");
    target.mBtBlog = finder.castView(view, 2131820757, "field 'mBtBlog'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131820664, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131820664, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131820760, "field 'mBtUpdate' and method 'onClick'");
    target.mBtUpdate = finder.castView(view, 2131820760, "field 'mBtUpdate'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mToolbarLayout = null;
    target.mBtBug = null;
    target.mBtCode = null;
    target.mBtShare = null;
    target.mTvVersion = null;
    target.mBtPay = null;
    target.mBtBlog = null;
    target.mToolbar = null;
    target.mBtUpdate = null;
  }
}
