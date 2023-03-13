package com.tochy.notesapp.view.pflockscreen.security.callbacks;

import com.tochy.notesapp.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
