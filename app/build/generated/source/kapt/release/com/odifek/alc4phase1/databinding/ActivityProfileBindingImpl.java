package com.odifek.alc4phase1.databinding;
import com.odifek.alc4phase1.R;
import com.odifek.alc4phase1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfileBindingImpl extends ActivityProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.imageview_banner, 3);
        sViewsWithIds.put(R.id.imageview_profile_pics, 4);
        sViewsWithIds.put(R.id.guideline3, 5);
        sViewsWithIds.put(R.id.textView_country_label, 6);
        sViewsWithIds.put(R.id.textView_email_label, 7);
        sViewsWithIds.put(R.id.textView_phone_label, 8);
        sViewsWithIds.put(R.id.textView5_slack_label, 9);
        sViewsWithIds.put(R.id.textView_name, 10);
        sViewsWithIds.put(R.id.barrier, 11);
        sViewsWithIds.put(R.id.textView_track, 12);
        sViewsWithIds.put(R.id.textView_country, 13);
        sViewsWithIds.put(R.id.textView_email, 14);
        sViewsWithIds.put(R.id.textView_phone, 15);
        sViewsWithIds.put(R.id.textView11, 16);
        sViewsWithIds.put(R.id.divider, 17);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (android.view.View) bindings[17]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}