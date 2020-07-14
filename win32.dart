// msgbox.dart
// Demonstrates a simple example of calling a Win32 API directly from Dart code.
// This sample relies on the ffi package. Download these two files to an empty
// directory and run `pub get` to download the ffi package prior to running this
// example.
import 'dart:ffi';
import 'package:ffi/ffi.dart';

// Native API signature for MessageBoxW. Int32 and IntPtr derive from Struct,
// which has reference semantics and is backed by native memory.
typedef MessageBoxNative = Int32 Function(
    IntPtr hWnd, Pointer<Utf16> lpText, Pointer<Utf16> lpCaption, Int32 uType);
// Dart API signature that maps to the native typedef.
typedef MessageBoxDart = int Function(
    int hWnd, Pointer<Utf16> lpText, Pointer<Utf16> lpCaption, int uType);
// The user32.dll Windows library contains shell APIs like MessageBox
final user32 = DynamicLibrary.open('user32.dll');
// Look up the wide-char version of MessageBox and map it to the typedef
final win32MessageBox =
    user32.lookupFunction<MessageBoxNative, MessageBoxDart>('MessageBoxW');
// Convenient helper method that provides a Dart/Flutter idiomatic
// implementation of the underlying Win32 API.
void showMessageBox(String message, String caption) => win32MessageBox(
    0, // No owner window
    Utf16.toUtf16(message), // Message
    Utf16.toUtf16(caption), // Window title
    0 // OK button only
    );
// Simple example of calling [showMessageBox] from a command line; you can
// alternatively make this call from a Flutter desktop app built for Windows.
void main() {
  showMessageBox('我是邓捷',
      '看看'); // call just like any other Dart function
}
