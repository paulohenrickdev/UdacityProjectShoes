package com.example.udacityprojectshoes;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.udacityprojectshoes.databinding.FragmentAddShoesBindingImpl;
import com.example.udacityprojectshoes.databinding.FragmentAddShoesBindingV21Impl;
import com.example.udacityprojectshoes.databinding.FragmentCreateAccountBindingImpl;
import com.example.udacityprojectshoes.databinding.FragmentInstructionsBindingImpl;
import com.example.udacityprojectshoes.databinding.FragmentListShoesBindingImpl;
import com.example.udacityprojectshoes.databinding.FragmentLoginBindingImpl;
import com.example.udacityprojectshoes.databinding.FragmentWelcomeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTADDSHOES = 1;

  private static final int LAYOUT_FRAGMENTCREATEACCOUNT = 2;

  private static final int LAYOUT_FRAGMENTINSTRUCTIONS = 3;

  private static final int LAYOUT_FRAGMENTLISTSHOES = 4;

  private static final int LAYOUT_FRAGMENTLOGIN = 5;

  private static final int LAYOUT_FRAGMENTWELCOME = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.udacityprojectshoes.R.layout.fragment_add_shoes, LAYOUT_FRAGMENTADDSHOES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.udacityprojectshoes.R.layout.fragment_create_account, LAYOUT_FRAGMENTCREATEACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.udacityprojectshoes.R.layout.fragment_instructions, LAYOUT_FRAGMENTINSTRUCTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.udacityprojectshoes.R.layout.fragment_list_shoes, LAYOUT_FRAGMENTLISTSHOES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.udacityprojectshoes.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.udacityprojectshoes.R.layout.fragment_welcome, LAYOUT_FRAGMENTWELCOME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTADDSHOES: {
          if ("layout-v21/fragment_add_shoes_0".equals(tag)) {
            return new FragmentAddShoesBindingV21Impl(component, view);
          }
          if ("layout/fragment_add_shoes_0".equals(tag)) {
            return new FragmentAddShoesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_shoes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCREATEACCOUNT: {
          if ("layout/fragment_create_account_0".equals(tag)) {
            return new FragmentCreateAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_account is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINSTRUCTIONS: {
          if ("layout/fragment_instructions_0".equals(tag)) {
            return new FragmentInstructionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_instructions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTSHOES: {
          if ("layout/fragment_list_shoes_0".equals(tag)) {
            return new FragmentListShoesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_shoes is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment_welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "loginViewModel");
      sKeys.put(2, "shoe");
      sKeys.put(3, "viewModelShoe");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout-v21/fragment_add_shoes_0", com.example.udacityprojectshoes.R.layout.fragment_add_shoes);
      sKeys.put("layout/fragment_add_shoes_0", com.example.udacityprojectshoes.R.layout.fragment_add_shoes);
      sKeys.put("layout/fragment_create_account_0", com.example.udacityprojectshoes.R.layout.fragment_create_account);
      sKeys.put("layout/fragment_instructions_0", com.example.udacityprojectshoes.R.layout.fragment_instructions);
      sKeys.put("layout/fragment_list_shoes_0", com.example.udacityprojectshoes.R.layout.fragment_list_shoes);
      sKeys.put("layout/fragment_login_0", com.example.udacityprojectshoes.R.layout.fragment_login);
      sKeys.put("layout/fragment_welcome_0", com.example.udacityprojectshoes.R.layout.fragment_welcome);
    }
  }
}
