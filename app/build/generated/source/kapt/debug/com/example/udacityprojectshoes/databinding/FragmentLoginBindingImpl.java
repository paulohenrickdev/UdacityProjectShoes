package com.example.udacityprojectshoes.databinding;
import com.example.udacityprojectshoes.R;
import com.example.udacityprojectshoes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.example.udacityprojectshoes.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 3);
        sViewsWithIds.put(R.id.editTextEmail, 4);
        sViewsWithIds.put(R.id.editTextPassword, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.buttonLogin.setTag(null);
        this.createAccount.setTag(null);
        this.loginLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.udacityprojectshoes.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.example.udacityprojectshoes.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.example.udacityprojectshoes.screen.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.example.udacityprojectshoes.screen.login.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.udacityprojectshoes.screen.login.LoginViewModel loginViewModel = mLoginViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.buttonLogin.setOnClickListener(mCallback3);
            this.createAccount.setOnClickListener(mCallback4);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                com.example.udacityprojectshoes.screen.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {


                    loginViewModel.navigateToWelcome();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                com.example.udacityprojectshoes.screen.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {


                    loginViewModel.navigateToCreateAccount();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}