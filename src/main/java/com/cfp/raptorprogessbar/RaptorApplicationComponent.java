package com.cfp.raptorprogessbar;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RaptorApplicationComponent implements LafManagerListener {
    public RaptorApplicationComponent() {
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", RaptorProgressBarUi.class.getName());
        UIManager.getDefaults().put(RaptorProgressBarUi.class.getName(), RaptorProgressBarUi.class);
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager source) {
        updateProgressBarUi();
    }
}
