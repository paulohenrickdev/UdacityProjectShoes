package com.example.udacityprojectshoes.databinding;
import com.example.udacityprojectshoes.R;
import com.example.udacityprojectshoes.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddShoesBindingV21Impl extends FragmentAddShoesBinding implements com.example.udacityprojectshoes.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView5, 5);
    }
    // views
    @NonNull
    private final android.widget.Button mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddShoesBindingV21Impl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentAddShoesBindingV21Impl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            );
        this.addShoe.setTag(null);
        this.editTextDescriptionShoe.setTag(null);
        this.editTextNameShoe.setTag(null);
        this.loginLayout.setTag(null);
        this.mboundView4 = (android.widget.Button) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.udacityprojectshoes.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.udacityprojectshoes.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModelShoe == variableId) {
            setViewModelShoe((com.example.udacityprojectshoes.screen.shoes.ShoesViewModel) variable);
        }
        else if (BR.shoe == variableId) {
            setShoe((com.example.udacityprojectshoes.model.Shoe) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelShoe(@Nullable com.example.udacityprojectshoes.screen.shoes.ShoesViewModel ViewModelShoe) {
        this.mViewModelShoe = ViewModelShoe;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModelShoe);
        super.requestRebind();
    }
    public void setShoe(@Nullable com.example.udacityprojectshoes.model.Shoe Shoe) {
        this.mShoe = Shoe;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.shoe);
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
        com.example.udacityprojectshoes.screen.shoes.ShoesViewModel viewModelShoe = mViewModelShoe;
        com.example.udacityprojectshoes.model.Shoe shoe = mShoe;
        java.lang.String shoeName = null;
        java.lang.String shoeDescription = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (shoe != null) {
                    // read shoe.name
                    shoeName = shoe.getName();
                    // read shoe.description
                    shoeDescription = shoe.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.addShoe.setOnClickListener(mCallback1);
            this.mboundView4.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextDescriptionShoe, shoeDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextNameShoe, shoeName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModelShoe
                com.example.udacityprojectshoes.screen.shoes.ShoesViewModel viewModelShoe = mViewModelShoe;
                // viewModelShoe != null
                boolean viewModelShoeJavaLangObjectNull = false;



                viewModelShoeJavaLangObjectNull = (viewModelShoe) != (null);
                if (viewModelShoeJavaLangObjectNull) {




                    viewModelShoe.save(editTextNameShoe, editTextDescriptionShoe);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModelShoe
                com.example.udacityprojectshoes.screen.shoes.ShoesViewModel viewModelShoe = mViewModelShoe;
                // viewModelShoe != null
                boolean viewModelShoeJavaLangObjectNull = false;



                viewModelShoeJavaLangObjectNull = (viewModelShoe) != (null);
                if (viewModelShoeJavaLangObjectNull) {



                    viewModelShoe.cancelAddShoeList(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelShoe
        flag 1 (0x2L): shoe
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}