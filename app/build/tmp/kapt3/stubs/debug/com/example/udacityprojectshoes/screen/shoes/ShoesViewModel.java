package com.example.udacityprojectshoes.screen.shoes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/udacityprojectshoes/screen/shoes/ShoesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_shoes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/udacityprojectshoes/model/Shoe;", "shoeList", "Ljava/util/ArrayList;", "shoes", "Landroidx/lifecycle/LiveData;", "getShoes", "()Landroidx/lifecycle/LiveData;", "cancelAddShoeList", "", "view", "Landroid/view/View;", "save", "editName", "Landroid/widget/EditText;", "editDescription", "app_debug"})
public final class ShoesViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.udacityprojectshoes.model.Shoe>> _shoes = null;
    private final java.util.ArrayList<com.example.udacityprojectshoes.model.Shoe> shoeList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.udacityprojectshoes.model.Shoe>> getShoes() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editName, @org.jetbrains.annotations.NotNull()
    android.widget.EditText editDescription) {
    }
    
    public final void cancelAddShoeList(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public ShoesViewModel() {
        super();
    }
}