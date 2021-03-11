// Generated by data binding compiler. Do not edit!
package com.example.udacityprojectshoes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.udacityprojectshoes.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListShoesBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton addButton;

  @NonNull
  public final ConstraintLayout loginLayout;

  @NonNull
  public final ScrollView shoeScrollView;

  @NonNull
  public final LinearLayout shoeView;

  protected FragmentListShoesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton addButton, ConstraintLayout loginLayout, ScrollView shoeScrollView,
      LinearLayout shoeView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addButton = addButton;
    this.loginLayout = loginLayout;
    this.shoeScrollView = shoeScrollView;
    this.shoeView = shoeView;
  }

  @NonNull
  public static FragmentListShoesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_shoes, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListShoesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListShoesBinding>inflateInternal(inflater, R.layout.fragment_list_shoes, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListShoesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_shoes, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListShoesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListShoesBinding>inflateInternal(inflater, R.layout.fragment_list_shoes, null, false, component);
  }

  public static FragmentListShoesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentListShoesBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListShoesBinding)bind(component, view, R.layout.fragment_list_shoes);
  }
}