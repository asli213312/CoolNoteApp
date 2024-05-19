package com.example.coolnoteapp.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.coolnoteapp.feature_note.presentation.ui.theme.CleanArchitectureNoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureNoteAppTheme {

            }
        }
    }
}