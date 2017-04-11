@file:Suppress("UNUSED_EXPRESSION", "UNUSED_VARIABLE")
package sfml

import konan.SymbolName
import kotlinx.cinterop.*

fun sfTime_asSeconds(time: CValue<sfTime>): Float {
    return memScoped {
        val _time = time.getPointer(memScope).rawValue
        val res = kni_sfTime_asSeconds(_time)
        res
    }
}

fun sfTime_asMilliseconds(time: CValue<sfTime>): sfInt32 {
    return memScoped {
        val _time = time.getPointer(memScope).rawValue
        val res = kni_sfTime_asMilliseconds(_time)
        res
    }
}

fun sfTime_asMicroseconds(time: CValue<sfTime>): sfInt64 {
    return memScoped {
        val _time = time.getPointer(memScope).rawValue
        val res = kni_sfTime_asMicroseconds(_time)
        res
    }
}

fun sfSeconds(amount: Float): CValue<sfTime> {
    return memScoped {
        val _amount = amount
        val res = kni_sfSeconds(_amount, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

fun sfMilliseconds(amount: sfInt32): CValue<sfTime> {
    return memScoped {
        val _amount = amount
        val res = kni_sfMilliseconds(_amount, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

fun sfMicroseconds(amount: sfInt64): CValue<sfTime> {
    return memScoped {
        val _amount = amount
        val res = kni_sfMicroseconds(_amount, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfClock_create")
external fun sfClock_create(): CPointer<sfClock>?

fun sfClock_copy(clock: CValuesRef<sfClock>?): CPointer<sfClock>? {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_copy(_clock)
        interpretCPointer<sfClock>(res)
    }
}

fun sfClock_destroy(clock: CValuesRef<sfClock>?): Unit {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_destroy(_clock)
        res
    }
}

fun sfClock_getElapsedTime(clock: CValuesRef<sfClock>?): CValue<sfTime> {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_getElapsedTime(_clock, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

fun sfClock_restart(clock: CValuesRef<sfClock>?): CValue<sfTime> {
    return memScoped {
        val _clock = clock?.getPointer(memScope).rawValue
        val res = kni_sfClock_restart(_clock, alloc<sfTime>().rawPtr)
        interpretPointed<sfTime>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfMutex_create")
external fun sfMutex_create(): CPointer<sfMutex>?

fun sfMutex_destroy(mutex: CValuesRef<sfMutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_sfMutex_destroy(_mutex)
        res
    }
}

fun sfMutex_lock(mutex: CValuesRef<sfMutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_sfMutex_lock(_mutex)
        res
    }
}

fun sfMutex_unlock(mutex: CValuesRef<sfMutex>?): Unit {
    return memScoped {
        val _mutex = mutex?.getPointer(memScope).rawValue
        val res = kni_sfMutex_unlock(_mutex)
        res
    }
}

fun sfSleep(duration: CValue<sfTime>): Unit {
    return memScoped {
        val _duration = duration.getPointer(memScope).rawValue
        val res = kni_sfSleep(_duration)
        res
    }
}

@SymbolName("kni_sfml_sfThread_create")
external fun sfThread_create(function: CPointer<CFunction<CFunctionType1>>?, userData: COpaquePointer?): CPointer<sfThread>?

fun sfThread_destroy(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_destroy(_thread)
        res
    }
}

fun sfThread_launch(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_launch(_thread)
        res
    }
}

fun sfThread_wait(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_wait(_thread)
        res
    }
}

fun sfThread_terminate(thread: CValuesRef<sfThread>?): Unit {
    return memScoped {
        val _thread = thread?.getPointer(memScope).rawValue
        val res = kni_sfThread_terminate(_thread)
        res
    }
}

@SymbolName("kni_sfml_sfContext_create")
external fun sfContext_create(): CPointer<sfContext>?

fun sfContext_destroy(context: CValuesRef<sfContext>?): Unit {
    return memScoped {
        val _context = context?.getPointer(memScope).rawValue
        val res = kni_sfContext_destroy(_context)
        res
    }
}

fun sfContext_setActive(context: CValuesRef<sfContext>?, active: sfBool): Unit {
    return memScoped {
        val _context = context?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfContext_setActive(_context, _active)
        res
    }
}

@SymbolName("kni_sfml_sfJoystick_isConnected")
external fun sfJoystick_isConnected(joystick: Int): sfBool

@SymbolName("kni_sfml_sfJoystick_getButtonCount")
external fun sfJoystick_getButtonCount(joystick: Int): Int

@SymbolName("kni_sfml_sfJoystick_hasAxis")
external fun sfJoystick_hasAxis(joystick: Int, axis: sfJoystickAxis): sfBool

@SymbolName("kni_sfml_sfJoystick_isButtonPressed")
external fun sfJoystick_isButtonPressed(joystick: Int, button: Int): sfBool

@SymbolName("kni_sfml_sfJoystick_getAxisPosition")
external fun sfJoystick_getAxisPosition(joystick: Int, axis: sfJoystickAxis): Float

fun sfJoystick_getIdentification(joystick: Int): CValue<sfJoystickIdentification> {
    return memScoped {
        val _joystick = joystick
        val res = kni_sfJoystick_getIdentification(_joystick, alloc<sfJoystickIdentification>().rawPtr)
        interpretPointed<sfJoystickIdentification>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfJoystick_update")
external fun sfJoystick_update(): Unit

@SymbolName("kni_sfml_sfKeyboard_isKeyPressed")
external fun sfKeyboard_isKeyPressed(key: sfKeyCode): sfBool

@SymbolName("kni_sfml_sfMouse_isButtonPressed")
external fun sfMouse_isButtonPressed(button: sfMouseButton): sfBool

fun sfMouse_getPosition(relativeTo: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_getPosition(_relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfMouse_setPosition(position: CValue<sfVector2i>, relativeTo: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _position = position.getPointer(memScope).rawValue
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_setPosition(_position, _relativeTo)
        res
    }
}

@SymbolName("kni_sfml_sfSensor_isAvailable")
external fun sfSensor_isAvailable(sensor: sfSensorType): sfBool

@SymbolName("kni_sfml_sfSensor_setEnabled")
external fun sfSensor_setEnabled(sensor: sfSensorType, enabled: sfBool): Unit

fun sfSensor_getValue(sensor: sfSensorType): CValue<sfVector3f> {
    return memScoped {
        val _sensor = sensor.value
        val res = kni_sfSensor_getValue(_sensor, alloc<sfVector3f>().rawPtr)
        interpretPointed<sfVector3f>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfTouch_isDown")
external fun sfTouch_isDown(finger: Int): sfBool

fun sfTouch_getPosition(finger: Int, relativeTo: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _finger = finger
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfTouch_getPosition(_finger, _relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfVideoMode_getDesktopMode(): CValue<sfVideoMode> {
    return memScoped {
        val res = kni_sfVideoMode_getDesktopMode(alloc<sfVideoMode>().rawPtr)
        interpretPointed<sfVideoMode>(res).readValue()
    }
}

fun sfVideoMode_getFullscreenModes(Count: CValuesRef<size_tVar>?): CPointer<sfVideoMode>? {
    return memScoped {
        val _Count = Count?.getPointer(memScope).rawValue
        val res = kni_sfVideoMode_getFullscreenModes(_Count)
        interpretCPointer<sfVideoMode>(res)
    }
}

fun sfVideoMode_isValid(mode: CValue<sfVideoMode>): sfBool {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val res = kni_sfVideoMode_isValid(_mode)
        res
    }
}

fun sfWindow_create(mode: CValue<sfVideoMode>, title: String?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfWindow_create(_mode, _title, _style, _settings)
        interpretCPointer<sfWindow>(res)
    }
}

fun sfWindow_createUnicode(mode: CValue<sfVideoMode>, title: CValuesRef<sfUint32Var>?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfWindow_createUnicode(_mode, _title, _style, _settings)
        interpretCPointer<sfWindow>(res)
    }
}

fun sfWindow_createFromHandle(handle: sfWindowHandle, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    return memScoped {
        val _handle = handle
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfWindow_createFromHandle(_handle, _settings)
        interpretCPointer<sfWindow>(res)
    }
}

fun sfWindow_destroy(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_destroy(_window)
        res
    }
}

fun sfWindow_close(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_close(_window)
        res
    }
}

fun sfWindow_isOpen(window: CValuesRef<sfWindow>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_isOpen(_window)
        res
    }
}

fun sfWindow_getSettings(window: CValuesRef<sfWindow>?): CValue<sfContextSettings> {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getSettings(_window, alloc<sfContextSettings>().rawPtr)
        interpretPointed<sfContextSettings>(res).readValue()
    }
}

fun sfWindow_pollEvent(window: CValuesRef<sfWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfWindow_pollEvent(_window, _event)
        res
    }
}

fun sfWindow_waitEvent(window: CValuesRef<sfWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfWindow_waitEvent(_window, _event)
        res
    }
}

fun sfWindow_getPosition(window: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getPosition(_window, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfWindow_setPosition(window: CValuesRef<sfWindow>?, position: CValue<sfVector2i>): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfWindow_setPosition(_window, _position)
        res
    }
}

fun sfWindow_getSize(window: CValuesRef<sfWindow>?): CValue<sfVector2u> {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getSize(_window, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

fun sfWindow_setSize(window: CValuesRef<sfWindow>?, size: CValue<sfVector2u>): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfWindow_setSize(_window, _size)
        res
    }
}

fun sfWindow_setTitle(window: CValuesRef<sfWindow>?, title: String?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfWindow_setTitle(_window, _title)
        res
    }
}

fun sfWindow_setUnicodeTitle(window: CValuesRef<sfWindow>?, title: CValuesRef<sfUint32Var>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val res = kni_sfWindow_setUnicodeTitle(_window, _title)
        res
    }
}

fun sfWindow_setIcon(window: CValuesRef<sfWindow>?, width: Int, height: Int, pixels: CValuesRef<sfUint8Var>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _width = width
        val _height = height
        val _pixels = pixels?.getPointer(memScope).rawValue
        val res = kni_sfWindow_setIcon(_window, _width, _height, _pixels)
        res
    }
}

fun sfWindow_setVisible(window: CValuesRef<sfWindow>?, visible: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _visible = visible
        val res = kni_sfWindow_setVisible(_window, _visible)
        res
    }
}

fun sfWindow_setMouseCursorVisible(window: CValuesRef<sfWindow>?, visible: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _visible = visible
        val res = kni_sfWindow_setMouseCursorVisible(_window, _visible)
        res
    }
}

fun sfWindow_setVerticalSyncEnabled(window: CValuesRef<sfWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfWindow_setVerticalSyncEnabled(_window, _enabled)
        res
    }
}

fun sfWindow_setKeyRepeatEnabled(window: CValuesRef<sfWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfWindow_setKeyRepeatEnabled(_window, _enabled)
        res
    }
}

fun sfWindow_setActive(window: CValuesRef<sfWindow>?, active: sfBool): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfWindow_setActive(_window, _active)
        res
    }
}

fun sfWindow_requestFocus(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_requestFocus(_window)
        res
    }
}

fun sfWindow_hasFocus(window: CValuesRef<sfWindow>?): sfBool {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_hasFocus(_window)
        res
    }
}

fun sfWindow_display(window: CValuesRef<sfWindow>?): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_display(_window)
        res
    }
}

fun sfWindow_setFramerateLimit(window: CValuesRef<sfWindow>?, limit: Int): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _limit = limit
        val res = kni_sfWindow_setFramerateLimit(_window, _limit)
        res
    }
}

fun sfWindow_setJoystickThreshold(window: CValuesRef<sfWindow>?, threshold: Float): Unit {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val _threshold = threshold
        val res = kni_sfWindow_setJoystickThreshold(_window, _threshold)
        res
    }
}

fun sfWindow_getSystemHandle(window: CValuesRef<sfWindow>?): sfWindowHandle {
    return memScoped {
        val _window = window?.getPointer(memScope).rawValue
        val res = kni_sfWindow_getSystemHandle(_window)
        res
    }
}

fun sfColor_fromRGB(red: sfUint8, green: sfUint8, blue: sfUint8): CValue<sfColor> {
    return memScoped {
        val _red = red
        val _green = green
        val _blue = blue
        val res = kni_sfColor_fromRGB(_red, _green, _blue, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfColor_fromRGBA(red: sfUint8, green: sfUint8, blue: sfUint8, alpha: sfUint8): CValue<sfColor> {
    return memScoped {
        val _red = red
        val _green = green
        val _blue = blue
        val _alpha = alpha
        val res = kni_sfColor_fromRGBA(_red, _green, _blue, _alpha, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfColor_fromInteger(color: sfUint32): CValue<sfColor> {
    return memScoped {
        val _color = color
        val res = kni_sfColor_fromInteger(_color, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfColor_toInteger(color: CValue<sfColor>): sfUint32 {
    return memScoped {
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfColor_toInteger(_color)
        res
    }
}

fun sfColor_add(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    return memScoped {
        val _color1 = color1.getPointer(memScope).rawValue
        val _color2 = color2.getPointer(memScope).rawValue
        val res = kni_sfColor_add(_color1, _color2, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfColor_subtract(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    return memScoped {
        val _color1 = color1.getPointer(memScope).rawValue
        val _color2 = color2.getPointer(memScope).rawValue
        val res = kni_sfColor_subtract(_color1, _color2, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfColor_modulate(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    return memScoped {
        val _color1 = color1.getPointer(memScope).rawValue
        val _color2 = color2.getPointer(memScope).rawValue
        val res = kni_sfColor_modulate(_color1, _color2, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfFloatRect_contains(rect: CValuesRef<sfFloatRect>?, x: Float, y: Float): sfBool {
    return memScoped {
        val _rect = rect?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfFloatRect_contains(_rect, _x, _y)
        res
    }
}

fun sfIntRect_contains(rect: CValuesRef<sfIntRect>?, x: Int, y: Int): sfBool {
    return memScoped {
        val _rect = rect?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfIntRect_contains(_rect, _x, _y)
        res
    }
}

fun sfFloatRect_intersects(rect1: CValuesRef<sfFloatRect>?, rect2: CValuesRef<sfFloatRect>?, intersection: CValuesRef<sfFloatRect>?): sfBool {
    return memScoped {
        val _rect1 = rect1?.getPointer(memScope).rawValue
        val _rect2 = rect2?.getPointer(memScope).rawValue
        val _intersection = intersection?.getPointer(memScope).rawValue
        val res = kni_sfFloatRect_intersects(_rect1, _rect2, _intersection)
        res
    }
}

fun sfIntRect_intersects(rect1: CValuesRef<sfIntRect>?, rect2: CValuesRef<sfIntRect>?, intersection: CValuesRef<sfIntRect>?): sfBool {
    return memScoped {
        val _rect1 = rect1?.getPointer(memScope).rawValue
        val _rect2 = rect2?.getPointer(memScope).rawValue
        val _intersection = intersection?.getPointer(memScope).rawValue
        val res = kni_sfIntRect_intersects(_rect1, _rect2, _intersection)
        res
    }
}

fun sfTransform_fromMatrix(a00: Float, a01: Float, a02: Float, a10: Float, a11: Float, a12: Float, a20: Float, a21: Float, a22: Float): CValue<sfTransform> {
    return memScoped {
        val _a00 = a00
        val _a01 = a01
        val _a02 = a02
        val _a10 = a10
        val _a11 = a11
        val _a12 = a12
        val _a20 = a20
        val _a21 = a21
        val _a22 = a22
        val res = kni_sfTransform_fromMatrix(_a00, _a01, _a02, _a10, _a11, _a12, _a20, _a21, _a22, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfTransform_getMatrix(transform: CValuesRef<sfTransform>?, matrix: CValuesRef<FloatVar>?): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _matrix = matrix?.getPointer(memScope).rawValue
        val res = kni_sfTransform_getMatrix(_transform, _matrix)
        res
    }
}

fun sfTransform_getInverse(transform: CValuesRef<sfTransform>?): CValue<sfTransform> {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val res = kni_sfTransform_getInverse(_transform, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfTransform_transformPoint(transform: CValuesRef<sfTransform>?, point: CValue<sfVector2f>): CValue<sfVector2f> {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val res = kni_sfTransform_transformPoint(_transform, _point, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfTransform_transformRect(transform: CValuesRef<sfTransform>?, rectangle: CValue<sfFloatRect>): CValue<sfFloatRect> {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfTransform_transformRect(_transform, _rectangle, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfTransform_combine(transform: CValuesRef<sfTransform>?, other: CValuesRef<sfTransform>?): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _other = other?.getPointer(memScope).rawValue
        val res = kni_sfTransform_combine(_transform, _other)
        res
    }
}

fun sfTransform_translate(transform: CValuesRef<sfTransform>?, x: Float, y: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTransform_translate(_transform, _x, _y)
        res
    }
}

fun sfTransform_rotate(transform: CValuesRef<sfTransform>?, angle: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfTransform_rotate(_transform, _angle)
        res
    }
}

fun sfTransform_rotateWithCenter(transform: CValuesRef<sfTransform>?, angle: Float, centerX: Float, centerY: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _angle = angle
        val _centerX = centerX
        val _centerY = centerY
        val res = kni_sfTransform_rotateWithCenter(_transform, _angle, _centerX, _centerY)
        res
    }
}

fun sfTransform_scale(transform: CValuesRef<sfTransform>?, scaleX: Float, scaleY: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _scaleX = scaleX
        val _scaleY = scaleY
        val res = kni_sfTransform_scale(_transform, _scaleX, _scaleY)
        res
    }
}

fun sfTransform_scaleWithCenter(transform: CValuesRef<sfTransform>?, scaleX: Float, scaleY: Float, centerX: Float, centerY: Float): Unit {
    return memScoped {
        val _transform = transform?.getPointer(memScope).rawValue
        val _scaleX = scaleX
        val _scaleY = scaleY
        val _centerX = centerX
        val _centerY = centerY
        val res = kni_sfTransform_scaleWithCenter(_transform, _scaleX, _scaleY, _centerX, _centerY)
        res
    }
}

@SymbolName("kni_sfml_sfCircleShape_create")
external fun sfCircleShape_create(): CPointer<sfCircleShape>?

fun sfCircleShape_copy(shape: CValuesRef<sfCircleShape>?): CPointer<sfCircleShape>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_copy(_shape)
        interpretCPointer<sfCircleShape>(res)
    }
}

fun sfCircleShape_destroy(shape: CValuesRef<sfCircleShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_destroy(_shape)
        res
    }
}

fun sfCircleShape_setPosition(shape: CValuesRef<sfCircleShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setPosition(_shape, _position)
        res
    }
}

fun sfCircleShape_setRotation(shape: CValuesRef<sfCircleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfCircleShape_setRotation(_shape, _angle)
        res
    }
}

fun sfCircleShape_setScale(shape: CValuesRef<sfCircleShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setScale(_shape, _scale)
        res
    }
}

fun sfCircleShape_setOrigin(shape: CValuesRef<sfCircleShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setOrigin(_shape, _origin)
        res
    }
}

fun sfCircleShape_getPosition(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfCircleShape_getRotation(shape: CValuesRef<sfCircleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getRotation(_shape)
        res
    }
}

fun sfCircleShape_getScale(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfCircleShape_getOrigin(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfCircleShape_move(shape: CValuesRef<sfCircleShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_move(_shape, _offset)
        res
    }
}

fun sfCircleShape_rotate(shape: CValuesRef<sfCircleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfCircleShape_rotate(_shape, _angle)
        res
    }
}

fun sfCircleShape_scale(shape: CValuesRef<sfCircleShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_scale(_shape, _factors)
        res
    }
}

fun sfCircleShape_getTransform(shape: CValuesRef<sfCircleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfCircleShape_getInverseTransform(shape: CValuesRef<sfCircleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfCircleShape_setTexture(shape: CValuesRef<sfCircleShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfCircleShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

fun sfCircleShape_setTextureRect(shape: CValuesRef<sfCircleShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setTextureRect(_shape, _rect)
        res
    }
}

fun sfCircleShape_setFillColor(shape: CValuesRef<sfCircleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setFillColor(_shape, _color)
        res
    }
}

fun sfCircleShape_setOutlineColor(shape: CValuesRef<sfCircleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_setOutlineColor(_shape, _color)
        res
    }
}

fun sfCircleShape_setOutlineThickness(shape: CValuesRef<sfCircleShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfCircleShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

fun sfCircleShape_getTexture(shape: CValuesRef<sfCircleShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfCircleShape_getTextureRect(shape: CValuesRef<sfCircleShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfCircleShape_getFillColor(shape: CValuesRef<sfCircleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfCircleShape_getOutlineColor(shape: CValuesRef<sfCircleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfCircleShape_getOutlineThickness(shape: CValuesRef<sfCircleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getOutlineThickness(_shape)
        res
    }
}

fun sfCircleShape_getPointCount(shape: CValuesRef<sfCircleShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getPointCount(_shape)
        res
    }
}

fun sfCircleShape_getPoint(shape: CValuesRef<sfCircleShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfCircleShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfCircleShape_setRadius(shape: CValuesRef<sfCircleShape>?, radius: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _radius = radius
        val res = kni_sfCircleShape_setRadius(_shape, _radius)
        res
    }
}

fun sfCircleShape_getRadius(shape: CValuesRef<sfCircleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getRadius(_shape)
        res
    }
}

fun sfCircleShape_setPointCount(shape: CValuesRef<sfCircleShape>?, count: size_t): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_sfCircleShape_setPointCount(_shape, _count)
        res
    }
}

fun sfCircleShape_getLocalBounds(shape: CValuesRef<sfCircleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfCircleShape_getGlobalBounds(shape: CValuesRef<sfCircleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfCircleShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfConvexShape_create")
external fun sfConvexShape_create(): CPointer<sfConvexShape>?

fun sfConvexShape_copy(shape: CValuesRef<sfConvexShape>?): CPointer<sfConvexShape>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_copy(_shape)
        interpretCPointer<sfConvexShape>(res)
    }
}

fun sfConvexShape_destroy(shape: CValuesRef<sfConvexShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_destroy(_shape)
        res
    }
}

fun sfConvexShape_setPosition(shape: CValuesRef<sfConvexShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setPosition(_shape, _position)
        res
    }
}

fun sfConvexShape_setRotation(shape: CValuesRef<sfConvexShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfConvexShape_setRotation(_shape, _angle)
        res
    }
}

fun sfConvexShape_setScale(shape: CValuesRef<sfConvexShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setScale(_shape, _scale)
        res
    }
}

fun sfConvexShape_setOrigin(shape: CValuesRef<sfConvexShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setOrigin(_shape, _origin)
        res
    }
}

fun sfConvexShape_getPosition(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfConvexShape_getRotation(shape: CValuesRef<sfConvexShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getRotation(_shape)
        res
    }
}

fun sfConvexShape_getScale(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfConvexShape_getOrigin(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfConvexShape_move(shape: CValuesRef<sfConvexShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_move(_shape, _offset)
        res
    }
}

fun sfConvexShape_rotate(shape: CValuesRef<sfConvexShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfConvexShape_rotate(_shape, _angle)
        res
    }
}

fun sfConvexShape_scale(shape: CValuesRef<sfConvexShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_scale(_shape, _factors)
        res
    }
}

fun sfConvexShape_getTransform(shape: CValuesRef<sfConvexShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfConvexShape_getInverseTransform(shape: CValuesRef<sfConvexShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfConvexShape_setTexture(shape: CValuesRef<sfConvexShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfConvexShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

fun sfConvexShape_setTextureRect(shape: CValuesRef<sfConvexShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setTextureRect(_shape, _rect)
        res
    }
}

fun sfConvexShape_setFillColor(shape: CValuesRef<sfConvexShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setFillColor(_shape, _color)
        res
    }
}

fun sfConvexShape_setOutlineColor(shape: CValuesRef<sfConvexShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setOutlineColor(_shape, _color)
        res
    }
}

fun sfConvexShape_setOutlineThickness(shape: CValuesRef<sfConvexShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfConvexShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

fun sfConvexShape_getTexture(shape: CValuesRef<sfConvexShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfConvexShape_getTextureRect(shape: CValuesRef<sfConvexShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfConvexShape_getFillColor(shape: CValuesRef<sfConvexShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfConvexShape_getOutlineColor(shape: CValuesRef<sfConvexShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfConvexShape_getOutlineThickness(shape: CValuesRef<sfConvexShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getOutlineThickness(_shape)
        res
    }
}

fun sfConvexShape_getPointCount(shape: CValuesRef<sfConvexShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getPointCount(_shape)
        res
    }
}

fun sfConvexShape_getPoint(shape: CValuesRef<sfConvexShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfConvexShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfConvexShape_setPointCount(shape: CValuesRef<sfConvexShape>?, count: size_t): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _count = count
        val res = kni_sfConvexShape_setPointCount(_shape, _count)
        res
    }
}

fun sfConvexShape_setPoint(shape: CValuesRef<sfConvexShape>?, index: size_t, point: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val _point = point.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_setPoint(_shape, _index, _point)
        res
    }
}

fun sfConvexShape_getLocalBounds(shape: CValuesRef<sfConvexShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfConvexShape_getGlobalBounds(shape: CValuesRef<sfConvexShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfConvexShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfFont_createFromFile(filename: String?): CPointer<sfFont>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfFont_createFromFile(_filename)
        interpretCPointer<sfFont>(res)
    }
}

@SymbolName("kni_sfml_sfFont_createFromMemory")
external fun sfFont_createFromMemory(data: COpaquePointer?, sizeInBytes: size_t): CPointer<sfFont>?

fun sfFont_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfFont>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val res = kni_sfFont_createFromStream(_stream)
        interpretCPointer<sfFont>(res)
    }
}

fun sfFont_copy(font: CValuesRef<sfFont>?): CPointer<sfFont>? {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfFont_copy(_font)
        interpretCPointer<sfFont>(res)
    }
}

fun sfFont_destroy(font: CValuesRef<sfFont>?): Unit {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfFont_destroy(_font)
        res
    }
}

fun sfFont_getGlyph(font: CValuesRef<sfFont>?, codePoint: sfUint32, characterSize: Int, bold: sfBool): CValue<sfGlyph> {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _codePoint = codePoint
        val _characterSize = characterSize
        val _bold = bold
        val res = kni_sfFont_getGlyph(_font, _codePoint, _characterSize, _bold, alloc<sfGlyph>().rawPtr)
        interpretPointed<sfGlyph>(res).readValue()
    }
}

fun sfFont_getKerning(font: CValuesRef<sfFont>?, first: sfUint32, second: sfUint32, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _first = first
        val _second = second
        val _characterSize = characterSize
        val res = kni_sfFont_getKerning(_font, _first, _second, _characterSize)
        res
    }
}

fun sfFont_getLineSpacing(font: CValuesRef<sfFont>?, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getLineSpacing(_font, _characterSize)
        res
    }
}

fun sfFont_getUnderlinePosition(font: CValuesRef<sfFont>?, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getUnderlinePosition(_font, _characterSize)
        res
    }
}

fun sfFont_getUnderlineThickness(font: CValuesRef<sfFont>?, characterSize: Int): Float {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getUnderlineThickness(_font, _characterSize)
        res
    }
}

fun sfFont_getTexture(font: CValuesRef<sfFont>?, characterSize: Int): CPointer<sfTexture>? {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val _characterSize = characterSize
        val res = kni_sfFont_getTexture(_font, _characterSize)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfFont_getInfo(font: CValuesRef<sfFont>?): CValue<sfFontInfo> {
    return memScoped {
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfFont_getInfo(_font, alloc<sfFontInfo>().rawPtr)
        interpretPointed<sfFontInfo>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfImage_create")
external fun sfImage_create(width: Int, height: Int): CPointer<sfImage>?

fun sfImage_createFromColor(width: Int, height: Int, color: CValue<sfColor>): CPointer<sfImage>? {
    return memScoped {
        val _width = width
        val _height = height
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromColor(_width, _height, _color)
        interpretCPointer<sfImage>(res)
    }
}

fun sfImage_createFromPixels(width: Int, height: Int, pixels: CValuesRef<sfUint8Var>?): CPointer<sfImage>? {
    return memScoped {
        val _width = width
        val _height = height
        val _pixels = pixels?.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromPixels(_width, _height, _pixels)
        interpretCPointer<sfImage>(res)
    }
}

fun sfImage_createFromFile(filename: String?): CPointer<sfImage>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromFile(_filename)
        interpretCPointer<sfImage>(res)
    }
}

@SymbolName("kni_sfml_sfImage_createFromMemory")
external fun sfImage_createFromMemory(data: COpaquePointer?, size: size_t): CPointer<sfImage>?

fun sfImage_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfImage>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val res = kni_sfImage_createFromStream(_stream)
        interpretCPointer<sfImage>(res)
    }
}

fun sfImage_copy(image: CValuesRef<sfImage>?): CPointer<sfImage>? {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_copy(_image)
        interpretCPointer<sfImage>(res)
    }
}

fun sfImage_destroy(image: CValuesRef<sfImage>?): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_destroy(_image)
        res
    }
}

fun sfImage_saveToFile(image: CValuesRef<sfImage>?, filename: String?): sfBool {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfImage_saveToFile(_image, _filename)
        res
    }
}

fun sfImage_getSize(image: CValuesRef<sfImage>?): CValue<sfVector2u> {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_getSize(_image, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

fun sfImage_createMaskFromColor(image: CValuesRef<sfImage>?, color: CValue<sfColor>, alpha: sfUint8): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val _alpha = alpha
        val res = kni_sfImage_createMaskFromColor(_image, _color, _alpha)
        res
    }
}

fun sfImage_copyImage(image: CValuesRef<sfImage>?, source: CValuesRef<sfImage>?, destX: Int, destY: Int, sourceRect: CValue<sfIntRect>, applyAlpha: sfBool): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _source = source?.getPointer(memScope).rawValue
        val _destX = destX
        val _destY = destY
        val _sourceRect = sourceRect.getPointer(memScope).rawValue
        val _applyAlpha = applyAlpha
        val res = kni_sfImage_copyImage(_image, _source, _destX, _destY, _sourceRect, _applyAlpha)
        res
    }
}

fun sfImage_setPixel(image: CValuesRef<sfImage>?, x: Int, y: Int, color: CValue<sfColor>): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfImage_setPixel(_image, _x, _y, _color)
        res
    }
}

fun sfImage_getPixel(image: CValuesRef<sfImage>?, x: Int, y: Int): CValue<sfColor> {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfImage_getPixel(_image, _x, _y, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfImage_getPixelsPtr(image: CValuesRef<sfImage>?): CPointer<sfUint8Var>? {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_getPixelsPtr(_image)
        interpretCPointer<sfUint8Var>(res)
    }
}

fun sfImage_flipHorizontally(image: CValuesRef<sfImage>?): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_flipHorizontally(_image)
        res
    }
}

fun sfImage_flipVertically(image: CValuesRef<sfImage>?): Unit {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val res = kni_sfImage_flipVertically(_image)
        res
    }
}

@SymbolName("kni_sfml_sfRectangleShape_create")
external fun sfRectangleShape_create(): CPointer<sfRectangleShape>?

fun sfRectangleShape_copy(shape: CValuesRef<sfRectangleShape>?): CPointer<sfRectangleShape>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_copy(_shape)
        interpretCPointer<sfRectangleShape>(res)
    }
}

fun sfRectangleShape_destroy(shape: CValuesRef<sfRectangleShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_destroy(_shape)
        res
    }
}

fun sfRectangleShape_setPosition(shape: CValuesRef<sfRectangleShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setPosition(_shape, _position)
        res
    }
}

fun sfRectangleShape_setRotation(shape: CValuesRef<sfRectangleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfRectangleShape_setRotation(_shape, _angle)
        res
    }
}

fun sfRectangleShape_setScale(shape: CValuesRef<sfRectangleShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setScale(_shape, _scale)
        res
    }
}

fun sfRectangleShape_setOrigin(shape: CValuesRef<sfRectangleShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setOrigin(_shape, _origin)
        res
    }
}

fun sfRectangleShape_getPosition(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRectangleShape_getRotation(shape: CValuesRef<sfRectangleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getRotation(_shape)
        res
    }
}

fun sfRectangleShape_getScale(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRectangleShape_getOrigin(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRectangleShape_move(shape: CValuesRef<sfRectangleShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_move(_shape, _offset)
        res
    }
}

fun sfRectangleShape_rotate(shape: CValuesRef<sfRectangleShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfRectangleShape_rotate(_shape, _angle)
        res
    }
}

fun sfRectangleShape_scale(shape: CValuesRef<sfRectangleShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_scale(_shape, _factors)
        res
    }
}

fun sfRectangleShape_getTransform(shape: CValuesRef<sfRectangleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfRectangleShape_getInverseTransform(shape: CValuesRef<sfRectangleShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfRectangleShape_setTexture(shape: CValuesRef<sfRectangleShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfRectangleShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

fun sfRectangleShape_setTextureRect(shape: CValuesRef<sfRectangleShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setTextureRect(_shape, _rect)
        res
    }
}

fun sfRectangleShape_setFillColor(shape: CValuesRef<sfRectangleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setFillColor(_shape, _color)
        res
    }
}

fun sfRectangleShape_setOutlineColor(shape: CValuesRef<sfRectangleShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setOutlineColor(_shape, _color)
        res
    }
}

fun sfRectangleShape_setOutlineThickness(shape: CValuesRef<sfRectangleShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfRectangleShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

fun sfRectangleShape_getTexture(shape: CValuesRef<sfRectangleShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfRectangleShape_getTextureRect(shape: CValuesRef<sfRectangleShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfRectangleShape_getFillColor(shape: CValuesRef<sfRectangleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfRectangleShape_getOutlineColor(shape: CValuesRef<sfRectangleShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfRectangleShape_getOutlineThickness(shape: CValuesRef<sfRectangleShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getOutlineThickness(_shape)
        res
    }
}

fun sfRectangleShape_getPointCount(shape: CValuesRef<sfRectangleShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getPointCount(_shape)
        res
    }
}

fun sfRectangleShape_getPoint(shape: CValuesRef<sfRectangleShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfRectangleShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRectangleShape_setSize(shape: CValuesRef<sfRectangleShape>?, size: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_setSize(_shape, _size)
        res
    }
}

fun sfRectangleShape_getSize(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getSize(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRectangleShape_getLocalBounds(shape: CValuesRef<sfRectangleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfRectangleShape_getGlobalBounds(shape: CValuesRef<sfRectangleShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfRectangleShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfRenderTexture_create")
external fun sfRenderTexture_create(width: Int, height: Int, depthBuffer: sfBool): CPointer<sfRenderTexture>?

fun sfRenderTexture_destroy(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_destroy(_renderTexture)
        res
    }
}

fun sfRenderTexture_getSize(renderTexture: CValuesRef<sfRenderTexture>?): CValue<sfVector2u> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getSize(_renderTexture, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

fun sfRenderTexture_setActive(renderTexture: CValuesRef<sfRenderTexture>?, active: sfBool): sfBool {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfRenderTexture_setActive(_renderTexture, _active)
        res
    }
}

fun sfRenderTexture_display(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_display(_renderTexture)
        res
    }
}

fun sfRenderTexture_clear(renderTexture: CValuesRef<sfRenderTexture>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_clear(_renderTexture, _color)
        res
    }
}

fun sfRenderTexture_setView(renderTexture: CValuesRef<sfRenderTexture>?, view: CValuesRef<sfView>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_setView(_renderTexture, _view)
        res
    }
}

fun sfRenderTexture_getView(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfView>? {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getView(_renderTexture)
        interpretCPointer<sfView>(res)
    }
}

fun sfRenderTexture_getDefaultView(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfView>? {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getDefaultView(_renderTexture)
        interpretCPointer<sfView>(res)
    }
}

fun sfRenderTexture_getViewport(renderTexture: CValuesRef<sfRenderTexture>?, view: CValuesRef<sfView>?): CValue<sfIntRect> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getViewport(_renderTexture, _view, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfRenderTexture_mapPixelToCoords(renderTexture: CValuesRef<sfRenderTexture>?, point: CValue<sfVector2i>, view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_mapPixelToCoords(_renderTexture, _point, _view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRenderTexture_mapCoordsToPixel(renderTexture: CValuesRef<sfRenderTexture>?, point: CValue<sfVector2f>, view: CValuesRef<sfView>?): CValue<sfVector2i> {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_mapCoordsToPixel(_renderTexture, _point, _view, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfRenderTexture_drawSprite(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfSprite>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawSprite(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawText(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfText>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawText(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawShape(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawCircleShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfCircleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawCircleShape(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawConvexShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfConvexShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawConvexShape(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawRectangleShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfRectangleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawRectangleShape(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawVertexArray(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfVertexArray>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawVertexArray(_renderTexture, _object, _states)
        res
    }
}

fun sfRenderTexture_drawPrimitives(renderTexture: CValuesRef<sfRenderTexture>?, vertices: CValuesRef<sfVertex>?, vertexCount: size_t, type: sfPrimitiveType, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _vertices = vertices?.getPointer(memScope).rawValue
        val _vertexCount = vertexCount
        val _type = type.value
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_drawPrimitives(_renderTexture, _vertices, _vertexCount, _type, _states)
        res
    }
}

fun sfRenderTexture_pushGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_pushGLStates(_renderTexture)
        res
    }
}

fun sfRenderTexture_popGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_popGLStates(_renderTexture)
        res
    }
}

fun sfRenderTexture_resetGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_resetGLStates(_renderTexture)
        res
    }
}

fun sfRenderTexture_getTexture(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfTexture>? {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_getTexture(_renderTexture)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfRenderTexture_setSmooth(renderTexture: CValuesRef<sfRenderTexture>?, smooth: sfBool): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _smooth = smooth
        val res = kni_sfRenderTexture_setSmooth(_renderTexture, _smooth)
        res
    }
}

fun sfRenderTexture_isSmooth(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_isSmooth(_renderTexture)
        res
    }
}

fun sfRenderTexture_setRepeated(renderTexture: CValuesRef<sfRenderTexture>?, repeated: sfBool): Unit {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val _repeated = repeated
        val res = kni_sfRenderTexture_setRepeated(_renderTexture, _repeated)
        res
    }
}

fun sfRenderTexture_isRepeated(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    return memScoped {
        val _renderTexture = renderTexture?.getPointer(memScope).rawValue
        val res = kni_sfRenderTexture_isRepeated(_renderTexture)
        res
    }
}

fun sfRenderWindow_create(mode: CValue<sfVideoMode>, title: String?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_create(_mode, _title, _style, _settings)
        interpretCPointer<sfRenderWindow>(res)
    }
}

fun sfRenderWindow_createUnicode(mode: CValue<sfVideoMode>, title: CValuesRef<sfUint32Var>?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    return memScoped {
        val _mode = mode.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val _style = style
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_createUnicode(_mode, _title, _style, _settings)
        interpretCPointer<sfRenderWindow>(res)
    }
}

fun sfRenderWindow_createFromHandle(handle: sfWindowHandle, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    return memScoped {
        val _handle = handle
        val _settings = settings?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_createFromHandle(_handle, _settings)
        interpretCPointer<sfRenderWindow>(res)
    }
}

fun sfRenderWindow_destroy(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_destroy(_renderWindow)
        res
    }
}

fun sfRenderWindow_close(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_close(_renderWindow)
        res
    }
}

fun sfRenderWindow_isOpen(renderWindow: CValuesRef<sfRenderWindow>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_isOpen(_renderWindow)
        res
    }
}

fun sfRenderWindow_getSettings(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfContextSettings> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getSettings(_renderWindow, alloc<sfContextSettings>().rawPtr)
        interpretPointed<sfContextSettings>(res).readValue()
    }
}

fun sfRenderWindow_pollEvent(renderWindow: CValuesRef<sfRenderWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_pollEvent(_renderWindow, _event)
        res
    }
}

fun sfRenderWindow_waitEvent(renderWindow: CValuesRef<sfRenderWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _event = event?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_waitEvent(_renderWindow, _event)
        res
    }
}

fun sfRenderWindow_getPosition(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getPosition(_renderWindow, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfRenderWindow_setPosition(renderWindow: CValuesRef<sfRenderWindow>?, position: CValue<sfVector2i>): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setPosition(_renderWindow, _position)
        res
    }
}

fun sfRenderWindow_getSize(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfVector2u> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getSize(_renderWindow, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

fun sfRenderWindow_setSize(renderWindow: CValuesRef<sfRenderWindow>?, size: CValue<sfVector2u>): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setSize(_renderWindow, _size)
        res
    }
}

fun sfRenderWindow_setTitle(renderWindow: CValuesRef<sfRenderWindow>?, title: String?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _title = title?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setTitle(_renderWindow, _title)
        res
    }
}

fun sfRenderWindow_setUnicodeTitle(renderWindow: CValuesRef<sfRenderWindow>?, title: CValuesRef<sfUint32Var>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _title = title?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setUnicodeTitle(_renderWindow, _title)
        res
    }
}

fun sfRenderWindow_setIcon(renderWindow: CValuesRef<sfRenderWindow>?, width: Int, height: Int, pixels: CValuesRef<sfUint8Var>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _width = width
        val _height = height
        val _pixels = pixels?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setIcon(_renderWindow, _width, _height, _pixels)
        res
    }
}

fun sfRenderWindow_setVisible(renderWindow: CValuesRef<sfRenderWindow>?, visible: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _visible = visible
        val res = kni_sfRenderWindow_setVisible(_renderWindow, _visible)
        res
    }
}

fun sfRenderWindow_setMouseCursorVisible(renderWindow: CValuesRef<sfRenderWindow>?, show: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _show = show
        val res = kni_sfRenderWindow_setMouseCursorVisible(_renderWindow, _show)
        res
    }
}

fun sfRenderWindow_setVerticalSyncEnabled(renderWindow: CValuesRef<sfRenderWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfRenderWindow_setVerticalSyncEnabled(_renderWindow, _enabled)
        res
    }
}

fun sfRenderWindow_setKeyRepeatEnabled(renderWindow: CValuesRef<sfRenderWindow>?, enabled: sfBool): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _enabled = enabled
        val res = kni_sfRenderWindow_setKeyRepeatEnabled(_renderWindow, _enabled)
        res
    }
}

fun sfRenderWindow_setActive(renderWindow: CValuesRef<sfRenderWindow>?, active: sfBool): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _active = active
        val res = kni_sfRenderWindow_setActive(_renderWindow, _active)
        res
    }
}

fun sfRenderWindow_requestFocus(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_requestFocus(_renderWindow)
        res
    }
}

fun sfRenderWindow_hasFocus(renderWindow: CValuesRef<sfRenderWindow>?): sfBool {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_hasFocus(_renderWindow)
        res
    }
}

fun sfRenderWindow_display(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_display(_renderWindow)
        res
    }
}

fun sfRenderWindow_setFramerateLimit(renderWindow: CValuesRef<sfRenderWindow>?, limit: Int): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _limit = limit
        val res = kni_sfRenderWindow_setFramerateLimit(_renderWindow, _limit)
        res
    }
}

fun sfRenderWindow_setJoystickThreshold(renderWindow: CValuesRef<sfRenderWindow>?, threshold: Float): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _threshold = threshold
        val res = kni_sfRenderWindow_setJoystickThreshold(_renderWindow, _threshold)
        res
    }
}

fun sfRenderWindow_getSystemHandle(renderWindow: CValuesRef<sfRenderWindow>?): sfWindowHandle {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getSystemHandle(_renderWindow)
        res
    }
}

fun sfRenderWindow_clear(renderWindow: CValuesRef<sfRenderWindow>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_clear(_renderWindow, _color)
        res
    }
}

fun sfRenderWindow_setView(renderWindow: CValuesRef<sfRenderWindow>?, view: CValuesRef<sfView>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_setView(_renderWindow, _view)
        res
    }
}

fun sfRenderWindow_getView(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfView>? {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getView(_renderWindow)
        interpretCPointer<sfView>(res)
    }
}

fun sfRenderWindow_getDefaultView(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfView>? {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getDefaultView(_renderWindow)
        interpretCPointer<sfView>(res)
    }
}

fun sfRenderWindow_getViewport(renderWindow: CValuesRef<sfRenderWindow>?, view: CValuesRef<sfView>?): CValue<sfIntRect> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_getViewport(_renderWindow, _view, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfRenderWindow_mapPixelToCoords(renderWindow: CValuesRef<sfRenderWindow>?, point: CValue<sfVector2i>, view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_mapPixelToCoords(_renderWindow, _point, _view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfRenderWindow_mapCoordsToPixel(renderWindow: CValuesRef<sfRenderWindow>?, point: CValue<sfVector2f>, view: CValuesRef<sfView>?): CValue<sfVector2i> {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _point = point.getPointer(memScope).rawValue
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_mapCoordsToPixel(_renderWindow, _point, _view, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfRenderWindow_drawSprite(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfSprite>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawSprite(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawText(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfText>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawText(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawShape(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawCircleShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfCircleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawCircleShape(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawConvexShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfConvexShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawConvexShape(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawRectangleShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfRectangleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawRectangleShape(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawVertexArray(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfVertexArray>?, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _object = `object`?.getPointer(memScope).rawValue
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawVertexArray(_renderWindow, _object, _states)
        res
    }
}

fun sfRenderWindow_drawPrimitives(renderWindow: CValuesRef<sfRenderWindow>?, vertices: CValuesRef<sfVertex>?, vertexCount: size_t, type: sfPrimitiveType, states: CValuesRef<sfRenderStates>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _vertices = vertices?.getPointer(memScope).rawValue
        val _vertexCount = vertexCount
        val _type = type.value
        val _states = states?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_drawPrimitives(_renderWindow, _vertices, _vertexCount, _type, _states)
        res
    }
}

fun sfRenderWindow_pushGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_pushGLStates(_renderWindow)
        res
    }
}

fun sfRenderWindow_popGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_popGLStates(_renderWindow)
        res
    }
}

fun sfRenderWindow_resetGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_resetGLStates(_renderWindow)
        res
    }
}

fun sfRenderWindow_capture(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfImage>? {
    return memScoped {
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val res = kni_sfRenderWindow_capture(_renderWindow)
        interpretCPointer<sfImage>(res)
    }
}

fun sfMouse_getPositionRenderWindow(relativeTo: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_getPositionRenderWindow(_relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfMouse_setPositionRenderWindow(position: CValue<sfVector2i>, relativeTo: CValuesRef<sfRenderWindow>?): Unit {
    return memScoped {
        val _position = position.getPointer(memScope).rawValue
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfMouse_setPositionRenderWindow(_position, _relativeTo)
        res
    }
}

fun sfTouch_getPositionRenderWindow(finger: Int, relativeTo: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    return memScoped {
        val _finger = finger
        val _relativeTo = relativeTo?.getPointer(memScope).rawValue
        val res = kni_sfTouch_getPositionRenderWindow(_finger, _relativeTo, alloc<sfVector2i>().rawPtr)
        interpretPointed<sfVector2i>(res).readValue()
    }
}

fun sfShader_createFromFile(vertexShaderFilename: String?, fragmentShaderFilename: String?): CPointer<sfShader>? {
    return memScoped {
        val _vertexShaderFilename = vertexShaderFilename?.cstr?.getPointer(memScope).rawValue
        val _fragmentShaderFilename = fragmentShaderFilename?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfShader_createFromFile(_vertexShaderFilename, _fragmentShaderFilename)
        interpretCPointer<sfShader>(res)
    }
}

fun sfShader_createFromMemory(vertexShader: String?, fragmentShader: String?): CPointer<sfShader>? {
    return memScoped {
        val _vertexShader = vertexShader?.cstr?.getPointer(memScope).rawValue
        val _fragmentShader = fragmentShader?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfShader_createFromMemory(_vertexShader, _fragmentShader)
        interpretCPointer<sfShader>(res)
    }
}

fun sfShader_createFromStream(vertexShaderStream: CValuesRef<sfInputStream>?, fragmentShaderStream: CValuesRef<sfInputStream>?): CPointer<sfShader>? {
    return memScoped {
        val _vertexShaderStream = vertexShaderStream?.getPointer(memScope).rawValue
        val _fragmentShaderStream = fragmentShaderStream?.getPointer(memScope).rawValue
        val res = kni_sfShader_createFromStream(_vertexShaderStream, _fragmentShaderStream)
        interpretCPointer<sfShader>(res)
    }
}

fun sfShader_destroy(shader: CValuesRef<sfShader>?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val res = kni_sfShader_destroy(_shader)
        res
    }
}

fun sfShader_setFloatParameter(shader: CValuesRef<sfShader>?, name: String?, x: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val res = kni_sfShader_setFloatParameter(_shader, _name, _x)
        res
    }
}

fun sfShader_setFloat2Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfShader_setFloat2Parameter(_shader, _name, _x, _y)
        res
    }
}

fun sfShader_setFloat3Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float, z: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _z = z
        val res = kni_sfShader_setFloat3Parameter(_shader, _name, _x, _y, _z)
        res
    }
}

fun sfShader_setFloat4Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float, z: Float, w: Float): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val _z = z
        val _w = w
        val res = kni_sfShader_setFloat4Parameter(_shader, _name, _x, _y, _z, _w)
        res
    }
}

fun sfShader_setVector2Parameter(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _vector = vector.getPointer(memScope).rawValue
        val res = kni_sfShader_setVector2Parameter(_shader, _name, _vector)
        res
    }
}

fun sfShader_setVector3Parameter(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfVector3f>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _vector = vector.getPointer(memScope).rawValue
        val res = kni_sfShader_setVector3Parameter(_shader, _name, _vector)
        res
    }
}

fun sfShader_setColorParameter(shader: CValuesRef<sfShader>?, name: String?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfShader_setColorParameter(_shader, _name, _color)
        res
    }
}

fun sfShader_setTransformParameter(shader: CValuesRef<sfShader>?, name: String?, transform: CValue<sfTransform>): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _transform = transform.getPointer(memScope).rawValue
        val res = kni_sfShader_setTransformParameter(_shader, _name, _transform)
        res
    }
}

fun sfShader_setTextureParameter(shader: CValuesRef<sfShader>?, name: String?, texture: CValuesRef<sfTexture>?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfShader_setTextureParameter(_shader, _name, _texture)
        res
    }
}

fun sfShader_setCurrentTextureParameter(shader: CValuesRef<sfShader>?, name: String?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val _name = name?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfShader_setCurrentTextureParameter(_shader, _name)
        res
    }
}

fun sfShader_getNativeHandle(shader: CValuesRef<sfShader>?): Int {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val res = kni_sfShader_getNativeHandle(_shader)
        res
    }
}

fun sfShader_bind(shader: CValuesRef<sfShader>?): Unit {
    return memScoped {
        val _shader = shader?.getPointer(memScope).rawValue
        val res = kni_sfShader_bind(_shader)
        res
    }
}

@SymbolName("kni_sfml_sfShader_isAvailable")
external fun sfShader_isAvailable(): sfBool

@SymbolName("kni_sfml_sfShape_create")
external fun sfShape_create(getPointCount: sfShapeGetPointCountCallback?, getPoint: sfShapeGetPointCallback?, userData: COpaquePointer?): CPointer<sfShape>?

fun sfShape_destroy(shape: CValuesRef<sfShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_destroy(_shape)
        res
    }
}

fun sfShape_setPosition(shape: CValuesRef<sfShape>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfShape_setPosition(_shape, _position)
        res
    }
}

fun sfShape_setRotation(shape: CValuesRef<sfShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfShape_setRotation(_shape, _angle)
        res
    }
}

fun sfShape_setScale(shape: CValuesRef<sfShape>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfShape_setScale(_shape, _scale)
        res
    }
}

fun sfShape_setOrigin(shape: CValuesRef<sfShape>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfShape_setOrigin(_shape, _origin)
        res
    }
}

fun sfShape_getPosition(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getPosition(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfShape_getRotation(shape: CValuesRef<sfShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getRotation(_shape)
        res
    }
}

fun sfShape_getScale(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getScale(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfShape_getOrigin(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getOrigin(_shape, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfShape_move(shape: CValuesRef<sfShape>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfShape_move(_shape, _offset)
        res
    }
}

fun sfShape_rotate(shape: CValuesRef<sfShape>?, angle: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfShape_rotate(_shape, _angle)
        res
    }
}

fun sfShape_scale(shape: CValuesRef<sfShape>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfShape_scale(_shape, _factors)
        res
    }
}

fun sfShape_getTransform(shape: CValuesRef<sfShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfShape_getInverseTransform(shape: CValuesRef<sfShape>?): CValue<sfTransform> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getInverseTransform(_shape, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfShape_setTexture(shape: CValuesRef<sfShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfShape_setTexture(_shape, _texture, _resetRect)
        res
    }
}

fun sfShape_setTextureRect(shape: CValuesRef<sfShape>?, rect: CValue<sfIntRect>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _rect = rect.getPointer(memScope).rawValue
        val res = kni_sfShape_setTextureRect(_shape, _rect)
        res
    }
}

fun sfShape_setFillColor(shape: CValuesRef<sfShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfShape_setFillColor(_shape, _color)
        res
    }
}

fun sfShape_setOutlineColor(shape: CValuesRef<sfShape>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfShape_setOutlineColor(_shape, _color)
        res
    }
}

fun sfShape_setOutlineThickness(shape: CValuesRef<sfShape>?, thickness: Float): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _thickness = thickness
        val res = kni_sfShape_setOutlineThickness(_shape, _thickness)
        res
    }
}

fun sfShape_getTexture(shape: CValuesRef<sfShape>?): CPointer<sfTexture>? {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getTexture(_shape)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfShape_getTextureRect(shape: CValuesRef<sfShape>?): CValue<sfIntRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getTextureRect(_shape, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfShape_getFillColor(shape: CValuesRef<sfShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getFillColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfShape_getOutlineColor(shape: CValuesRef<sfShape>?): CValue<sfColor> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getOutlineColor(_shape, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfShape_getOutlineThickness(shape: CValuesRef<sfShape>?): Float {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getOutlineThickness(_shape)
        res
    }
}

fun sfShape_getPointCount(shape: CValuesRef<sfShape>?): size_t {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getPointCount(_shape)
        res
    }
}

fun sfShape_getPoint(shape: CValuesRef<sfShape>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfShape_getPoint(_shape, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfShape_getLocalBounds(shape: CValuesRef<sfShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getLocalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfShape_getGlobalBounds(shape: CValuesRef<sfShape>?): CValue<sfFloatRect> {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_getGlobalBounds(_shape, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfShape_update(shape: CValuesRef<sfShape>?): Unit {
    return memScoped {
        val _shape = shape?.getPointer(memScope).rawValue
        val res = kni_sfShape_update(_shape)
        res
    }
}

@SymbolName("kni_sfml_sfSprite_create")
external fun sfSprite_create(): CPointer<sfSprite>?

fun sfSprite_copy(sprite: CValuesRef<sfSprite>?): CPointer<sfSprite>? {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_copy(_sprite)
        interpretCPointer<sfSprite>(res)
    }
}

fun sfSprite_destroy(sprite: CValuesRef<sfSprite>?): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_destroy(_sprite)
        res
    }
}

fun sfSprite_setPosition(sprite: CValuesRef<sfSprite>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfSprite_setPosition(_sprite, _position)
        res
    }
}

fun sfSprite_setRotation(sprite: CValuesRef<sfSprite>?, angle: Float): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfSprite_setRotation(_sprite, _angle)
        res
    }
}

fun sfSprite_setScale(sprite: CValuesRef<sfSprite>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfSprite_setScale(_sprite, _scale)
        res
    }
}

fun sfSprite_setOrigin(sprite: CValuesRef<sfSprite>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfSprite_setOrigin(_sprite, _origin)
        res
    }
}

fun sfSprite_getPosition(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getPosition(_sprite, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfSprite_getRotation(sprite: CValuesRef<sfSprite>?): Float {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getRotation(_sprite)
        res
    }
}

fun sfSprite_getScale(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getScale(_sprite, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfSprite_getOrigin(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getOrigin(_sprite, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfSprite_move(sprite: CValuesRef<sfSprite>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfSprite_move(_sprite, _offset)
        res
    }
}

fun sfSprite_rotate(sprite: CValuesRef<sfSprite>?, angle: Float): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfSprite_rotate(_sprite, _angle)
        res
    }
}

fun sfSprite_scale(sprite: CValuesRef<sfSprite>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfSprite_scale(_sprite, _factors)
        res
    }
}

fun sfSprite_getTransform(sprite: CValuesRef<sfSprite>?): CValue<sfTransform> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getTransform(_sprite, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfSprite_getInverseTransform(sprite: CValuesRef<sfSprite>?): CValue<sfTransform> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getInverseTransform(_sprite, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfSprite_setTexture(sprite: CValuesRef<sfSprite>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _texture = texture?.getPointer(memScope).rawValue
        val _resetRect = resetRect
        val res = kni_sfSprite_setTexture(_sprite, _texture, _resetRect)
        res
    }
}

fun sfSprite_setTextureRect(sprite: CValuesRef<sfSprite>?, rectangle: CValue<sfIntRect>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfSprite_setTextureRect(_sprite, _rectangle)
        res
    }
}

fun sfSprite_setColor(sprite: CValuesRef<sfSprite>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfSprite_setColor(_sprite, _color)
        res
    }
}

fun sfSprite_getTexture(sprite: CValuesRef<sfSprite>?): CPointer<sfTexture>? {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getTexture(_sprite)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfSprite_getTextureRect(sprite: CValuesRef<sfSprite>?): CValue<sfIntRect> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getTextureRect(_sprite, alloc<sfIntRect>().rawPtr)
        interpretPointed<sfIntRect>(res).readValue()
    }
}

fun sfSprite_getColor(sprite: CValuesRef<sfSprite>?): CValue<sfColor> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getColor(_sprite, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfSprite_getLocalBounds(sprite: CValuesRef<sfSprite>?): CValue<sfFloatRect> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getLocalBounds(_sprite, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfSprite_getGlobalBounds(sprite: CValuesRef<sfSprite>?): CValue<sfFloatRect> {
    return memScoped {
        val _sprite = sprite?.getPointer(memScope).rawValue
        val res = kni_sfSprite_getGlobalBounds(_sprite, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfText_create")
external fun sfText_create(): CPointer<sfText>?

fun sfText_copy(text: CValuesRef<sfText>?): CPointer<sfText>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_copy(_text)
        interpretCPointer<sfText>(res)
    }
}

fun sfText_destroy(text: CValuesRef<sfText>?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_destroy(_text)
        res
    }
}

fun sfText_setPosition(text: CValuesRef<sfText>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfText_setPosition(_text, _position)
        res
    }
}

fun sfText_setRotation(text: CValuesRef<sfText>?, angle: Float): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfText_setRotation(_text, _angle)
        res
    }
}

fun sfText_setScale(text: CValuesRef<sfText>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfText_setScale(_text, _scale)
        res
    }
}

fun sfText_setOrigin(text: CValuesRef<sfText>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfText_setOrigin(_text, _origin)
        res
    }
}

fun sfText_getPosition(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getPosition(_text, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfText_getRotation(text: CValuesRef<sfText>?): Float {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getRotation(_text)
        res
    }
}

fun sfText_getScale(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getScale(_text, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfText_getOrigin(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getOrigin(_text, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfText_move(text: CValuesRef<sfText>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfText_move(_text, _offset)
        res
    }
}

fun sfText_rotate(text: CValuesRef<sfText>?, angle: Float): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfText_rotate(_text, _angle)
        res
    }
}

fun sfText_scale(text: CValuesRef<sfText>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfText_scale(_text, _factors)
        res
    }
}

fun sfText_getTransform(text: CValuesRef<sfText>?): CValue<sfTransform> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getTransform(_text, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfText_getInverseTransform(text: CValuesRef<sfText>?): CValue<sfTransform> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getInverseTransform(_text, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfText_setString(text: CValuesRef<sfText>?, string: String?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _string = string?.cstr?.getPointer(memScope).rawValue
        val res = kni_sfText_setString(_text, _string)
        res
    }
}

fun sfText_setUnicodeString(text: CValuesRef<sfText>?, string: CValuesRef<sfUint32Var>?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _string = string?.getPointer(memScope).rawValue
        val res = kni_sfText_setUnicodeString(_text, _string)
        res
    }
}

fun sfText_setFont(text: CValuesRef<sfText>?, font: CValuesRef<sfFont>?): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _font = font?.getPointer(memScope).rawValue
        val res = kni_sfText_setFont(_text, _font)
        res
    }
}

fun sfText_setCharacterSize(text: CValuesRef<sfText>?, size: Int): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _size = size
        val res = kni_sfText_setCharacterSize(_text, _size)
        res
    }
}

fun sfText_setStyle(text: CValuesRef<sfText>?, style: sfUint32): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _style = style
        val res = kni_sfText_setStyle(_text, _style)
        res
    }
}

fun sfText_setColor(text: CValuesRef<sfText>?, color: CValue<sfColor>): Unit {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _color = color.getPointer(memScope).rawValue
        val res = kni_sfText_setColor(_text, _color)
        res
    }
}

fun sfText_getString(text: CValuesRef<sfText>?): CPointer<ByteVar>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getString(_text)
        interpretCPointer<ByteVar>(res)
    }
}

fun sfText_getUnicodeString(text: CValuesRef<sfText>?): CPointer<sfUint32Var>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getUnicodeString(_text)
        interpretCPointer<sfUint32Var>(res)
    }
}

fun sfText_getFont(text: CValuesRef<sfText>?): CPointer<sfFont>? {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getFont(_text)
        interpretCPointer<sfFont>(res)
    }
}

fun sfText_getCharacterSize(text: CValuesRef<sfText>?): Int {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getCharacterSize(_text)
        res
    }
}

fun sfText_getStyle(text: CValuesRef<sfText>?): sfUint32 {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getStyle(_text)
        res
    }
}

fun sfText_getColor(text: CValuesRef<sfText>?): CValue<sfColor> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getColor(_text, alloc<sfColor>().rawPtr)
        interpretPointed<sfColor>(res).readValue()
    }
}

fun sfText_findCharacterPos(text: CValuesRef<sfText>?, index: size_t): CValue<sfVector2f> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfText_findCharacterPos(_text, _index, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfText_getLocalBounds(text: CValuesRef<sfText>?): CValue<sfFloatRect> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getLocalBounds(_text, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfText_getGlobalBounds(text: CValuesRef<sfText>?): CValue<sfFloatRect> {
    return memScoped {
        val _text = text?.getPointer(memScope).rawValue
        val res = kni_sfText_getGlobalBounds(_text, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfTexture_create")
external fun sfTexture_create(width: Int, height: Int): CPointer<sfTexture>?

fun sfTexture_createFromFile(filename: String?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _filename = filename?.cstr?.getPointer(memScope).rawValue
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromFile(_filename, _area)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfTexture_createFromMemory(data: COpaquePointer?, sizeInBytes: size_t, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _data = data.rawValue
        val _sizeInBytes = sizeInBytes
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromMemory(_data, _sizeInBytes, _area)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfTexture_createFromStream(stream: CValuesRef<sfInputStream>?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _stream = stream?.getPointer(memScope).rawValue
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromStream(_stream, _area)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfTexture_createFromImage(image: CValuesRef<sfImage>?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    return memScoped {
        val _image = image?.getPointer(memScope).rawValue
        val _area = area?.getPointer(memScope).rawValue
        val res = kni_sfTexture_createFromImage(_image, _area)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfTexture_copy(texture: CValuesRef<sfTexture>?): CPointer<sfTexture>? {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_copy(_texture)
        interpretCPointer<sfTexture>(res)
    }
}

fun sfTexture_destroy(texture: CValuesRef<sfTexture>?): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_destroy(_texture)
        res
    }
}

fun sfTexture_getSize(texture: CValuesRef<sfTexture>?): CValue<sfVector2u> {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_getSize(_texture, alloc<sfVector2u>().rawPtr)
        interpretPointed<sfVector2u>(res).readValue()
    }
}

fun sfTexture_copyToImage(texture: CValuesRef<sfTexture>?): CPointer<sfImage>? {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_copyToImage(_texture)
        interpretCPointer<sfImage>(res)
    }
}

fun sfTexture_updateFromPixels(texture: CValuesRef<sfTexture>?, pixels: CValuesRef<sfUint8Var>?, width: Int, height: Int, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _pixels = pixels?.getPointer(memScope).rawValue
        val _width = width
        val _height = height
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromPixels(_texture, _pixels, _width, _height, _x, _y)
        res
    }
}

fun sfTexture_updateFromImage(texture: CValuesRef<sfTexture>?, image: CValuesRef<sfImage>?, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _image = image?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromImage(_texture, _image, _x, _y)
        res
    }
}

fun sfTexture_updateFromWindow(texture: CValuesRef<sfTexture>?, window: CValuesRef<sfWindow>?, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _window = window?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromWindow(_texture, _window, _x, _y)
        res
    }
}

fun sfTexture_updateFromRenderWindow(texture: CValuesRef<sfTexture>?, renderWindow: CValuesRef<sfRenderWindow>?, x: Int, y: Int): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _renderWindow = renderWindow?.getPointer(memScope).rawValue
        val _x = x
        val _y = y
        val res = kni_sfTexture_updateFromRenderWindow(_texture, _renderWindow, _x, _y)
        res
    }
}

fun sfTexture_setSmooth(texture: CValuesRef<sfTexture>?, smooth: sfBool): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _smooth = smooth
        val res = kni_sfTexture_setSmooth(_texture, _smooth)
        res
    }
}

fun sfTexture_isSmooth(texture: CValuesRef<sfTexture>?): sfBool {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_isSmooth(_texture)
        res
    }
}

fun sfTexture_setRepeated(texture: CValuesRef<sfTexture>?, repeated: sfBool): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val _repeated = repeated
        val res = kni_sfTexture_setRepeated(_texture, _repeated)
        res
    }
}

fun sfTexture_isRepeated(texture: CValuesRef<sfTexture>?): sfBool {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_isRepeated(_texture)
        res
    }
}

fun sfTexture_getNativeHandle(texture: CValuesRef<sfTexture>?): Int {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_getNativeHandle(_texture)
        res
    }
}

fun sfTexture_bind(texture: CValuesRef<sfTexture>?): Unit {
    return memScoped {
        val _texture = texture?.getPointer(memScope).rawValue
        val res = kni_sfTexture_bind(_texture)
        res
    }
}

@SymbolName("kni_sfml_sfTexture_getMaximumSize")
external fun sfTexture_getMaximumSize(): Int

@SymbolName("kni_sfml_sfTransformable_create")
external fun sfTransformable_create(): CPointer<sfTransformable>?

fun sfTransformable_copy(transformable: CValuesRef<sfTransformable>?): CPointer<sfTransformable>? {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_copy(_transformable)
        interpretCPointer<sfTransformable>(res)
    }
}

fun sfTransformable_destroy(transformable: CValuesRef<sfTransformable>?): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_destroy(_transformable)
        res
    }
}

fun sfTransformable_setPosition(transformable: CValuesRef<sfTransformable>?, position: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _position = position.getPointer(memScope).rawValue
        val res = kni_sfTransformable_setPosition(_transformable, _position)
        res
    }
}

fun sfTransformable_setRotation(transformable: CValuesRef<sfTransformable>?, angle: Float): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfTransformable_setRotation(_transformable, _angle)
        res
    }
}

fun sfTransformable_setScale(transformable: CValuesRef<sfTransformable>?, scale: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _scale = scale.getPointer(memScope).rawValue
        val res = kni_sfTransformable_setScale(_transformable, _scale)
        res
    }
}

fun sfTransformable_setOrigin(transformable: CValuesRef<sfTransformable>?, origin: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _origin = origin.getPointer(memScope).rawValue
        val res = kni_sfTransformable_setOrigin(_transformable, _origin)
        res
    }
}

fun sfTransformable_getPosition(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getPosition(_transformable, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfTransformable_getRotation(transformable: CValuesRef<sfTransformable>?): Float {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getRotation(_transformable)
        res
    }
}

fun sfTransformable_getScale(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getScale(_transformable, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfTransformable_getOrigin(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getOrigin(_transformable, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfTransformable_move(transformable: CValuesRef<sfTransformable>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfTransformable_move(_transformable, _offset)
        res
    }
}

fun sfTransformable_rotate(transformable: CValuesRef<sfTransformable>?, angle: Float): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfTransformable_rotate(_transformable, _angle)
        res
    }
}

fun sfTransformable_scale(transformable: CValuesRef<sfTransformable>?, factors: CValue<sfVector2f>): Unit {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val _factors = factors.getPointer(memScope).rawValue
        val res = kni_sfTransformable_scale(_transformable, _factors)
        res
    }
}

fun sfTransformable_getTransform(transformable: CValuesRef<sfTransformable>?): CValue<sfTransform> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getTransform(_transformable, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

fun sfTransformable_getInverseTransform(transformable: CValuesRef<sfTransformable>?): CValue<sfTransform> {
    return memScoped {
        val _transformable = transformable?.getPointer(memScope).rawValue
        val res = kni_sfTransformable_getInverseTransform(_transformable, alloc<sfTransform>().rawPtr)
        interpretPointed<sfTransform>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfVertexArray_create")
external fun sfVertexArray_create(): CPointer<sfVertexArray>?

fun sfVertexArray_copy(vertexArray: CValuesRef<sfVertexArray>?): CPointer<sfVertexArray>? {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_copy(_vertexArray)
        interpretCPointer<sfVertexArray>(res)
    }
}

fun sfVertexArray_destroy(vertexArray: CValuesRef<sfVertexArray>?): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_destroy(_vertexArray)
        res
    }
}

fun sfVertexArray_getVertexCount(vertexArray: CValuesRef<sfVertexArray>?): size_t {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_getVertexCount(_vertexArray)
        res
    }
}

fun sfVertexArray_getVertex(vertexArray: CValuesRef<sfVertexArray>?, index: size_t): CPointer<sfVertex>? {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _index = index
        val res = kni_sfVertexArray_getVertex(_vertexArray, _index)
        interpretCPointer<sfVertex>(res)
    }
}

fun sfVertexArray_clear(vertexArray: CValuesRef<sfVertexArray>?): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_clear(_vertexArray)
        res
    }
}

fun sfVertexArray_resize(vertexArray: CValuesRef<sfVertexArray>?, vertexCount: size_t): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _vertexCount = vertexCount
        val res = kni_sfVertexArray_resize(_vertexArray, _vertexCount)
        res
    }
}

fun sfVertexArray_append(vertexArray: CValuesRef<sfVertexArray>?, vertex: CValue<sfVertex>): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _vertex = vertex.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_append(_vertexArray, _vertex)
        res
    }
}

fun sfVertexArray_setPrimitiveType(vertexArray: CValuesRef<sfVertexArray>?, type: sfPrimitiveType): Unit {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val _type = type.value
        val res = kni_sfVertexArray_setPrimitiveType(_vertexArray, _type)
        res
    }
}

fun sfVertexArray_getPrimitiveType(vertexArray: CValuesRef<sfVertexArray>?): sfPrimitiveType {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_getPrimitiveType(_vertexArray)
        sfPrimitiveType.byValue(res)
    }
}

fun sfVertexArray_getBounds(vertexArray: CValuesRef<sfVertexArray>?): CValue<sfFloatRect> {
    return memScoped {
        val _vertexArray = vertexArray?.getPointer(memScope).rawValue
        val res = kni_sfVertexArray_getBounds(_vertexArray, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

@SymbolName("kni_sfml_sfView_create")
external fun sfView_create(): CPointer<sfView>?

fun sfView_createFromRect(rectangle: CValue<sfFloatRect>): CPointer<sfView>? {
    return memScoped {
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfView_createFromRect(_rectangle)
        interpretCPointer<sfView>(res)
    }
}

fun sfView_copy(view: CValuesRef<sfView>?): CPointer<sfView>? {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_copy(_view)
        interpretCPointer<sfView>(res)
    }
}

fun sfView_destroy(view: CValuesRef<sfView>?): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_destroy(_view)
        res
    }
}

fun sfView_setCenter(view: CValuesRef<sfView>?, center: CValue<sfVector2f>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _center = center.getPointer(memScope).rawValue
        val res = kni_sfView_setCenter(_view, _center)
        res
    }
}

fun sfView_setSize(view: CValuesRef<sfView>?, size: CValue<sfVector2f>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _size = size.getPointer(memScope).rawValue
        val res = kni_sfView_setSize(_view, _size)
        res
    }
}

fun sfView_setRotation(view: CValuesRef<sfView>?, angle: Float): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfView_setRotation(_view, _angle)
        res
    }
}

fun sfView_setViewport(view: CValuesRef<sfView>?, viewport: CValue<sfFloatRect>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _viewport = viewport.getPointer(memScope).rawValue
        val res = kni_sfView_setViewport(_view, _viewport)
        res
    }
}

fun sfView_reset(view: CValuesRef<sfView>?, rectangle: CValue<sfFloatRect>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _rectangle = rectangle.getPointer(memScope).rawValue
        val res = kni_sfView_reset(_view, _rectangle)
        res
    }
}

fun sfView_getCenter(view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getCenter(_view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfView_getSize(view: CValuesRef<sfView>?): CValue<sfVector2f> {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getSize(_view, alloc<sfVector2f>().rawPtr)
        interpretPointed<sfVector2f>(res).readValue()
    }
}

fun sfView_getRotation(view: CValuesRef<sfView>?): Float {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getRotation(_view)
        res
    }
}

fun sfView_getViewport(view: CValuesRef<sfView>?): CValue<sfFloatRect> {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val res = kni_sfView_getViewport(_view, alloc<sfFloatRect>().rawPtr)
        interpretPointed<sfFloatRect>(res).readValue()
    }
}

fun sfView_move(view: CValuesRef<sfView>?, offset: CValue<sfVector2f>): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _offset = offset.getPointer(memScope).rawValue
        val res = kni_sfView_move(_view, _offset)
        res
    }
}

fun sfView_rotate(view: CValuesRef<sfView>?, angle: Float): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _angle = angle
        val res = kni_sfView_rotate(_view, _angle)
        res
    }
}

fun sfView_zoom(view: CValuesRef<sfView>?, factor: Float): Unit {
    return memScoped {
        val _view = view?.getPointer(memScope).rawValue
        val _factor = factor
        val res = kni_sfView_zoom(_view, _factor)
        res
    }
}

val __llvm__: Int = 1
val __clang__: Int = 1
val __clang_major__: Int = 3
val __clang_minor__: Int = 9
val __clang_patchlevel__: Int = 0
val __GNUC_MINOR__: Int = 2
val __GNUC_PATCHLEVEL__: Int = 1
val __GNUC__: Int = 4
val __GXX_ABI_VERSION: Int = 1002
val __ATOMIC_RELAXED: Int = 0
val __ATOMIC_CONSUME: Int = 1
val __ATOMIC_ACQUIRE: Int = 2
val __ATOMIC_RELEASE: Int = 3
val __ATOMIC_ACQ_REL: Int = 4
val __ATOMIC_SEQ_CST: Int = 5
val __PRAGMA_REDEFINE_EXTNAME: Int = 1
val __CONSTANT_CFSTRINGS__: Int = 1
val __ORDER_LITTLE_ENDIAN__: Int = 1234
val __ORDER_BIG_ENDIAN__: Int = 4321
val __ORDER_PDP_ENDIAN__: Int = 3412
val __BYTE_ORDER__: Int = 1234
val __LITTLE_ENDIAN__: Int = 1
val _LP64: Int = 1
val __LP64__: Int = 1
val __CHAR_BIT__: Int = 8
val __SCHAR_MAX__: Int = 127
val __SHRT_MAX__: Int = 32767
val __INT_MAX__: Int = 2147483647
val __LONG_MAX__: Long = 9223372036854775807
val __LONG_LONG_MAX__: Long = 9223372036854775807
val __WCHAR_MAX__: Int = 2147483647
val __INTMAX_MAX__: Long = 9223372036854775807
val __SIZE_MAX__: Long = -1
val __UINTMAX_MAX__: Long = -1
val __PTRDIFF_MAX__: Long = 9223372036854775807
val __INTPTR_MAX__: Long = 9223372036854775807
val __UINTPTR_MAX__: Long = -1
val __SIZEOF_DOUBLE__: Int = 8
val __SIZEOF_FLOAT__: Int = 4
val __SIZEOF_INT__: Int = 4
val __SIZEOF_LONG__: Int = 8
val __SIZEOF_LONG_DOUBLE__: Int = 16
val __SIZEOF_LONG_LONG__: Int = 8
val __SIZEOF_POINTER__: Int = 8
val __SIZEOF_SHORT__: Int = 2
val __SIZEOF_PTRDIFF_T__: Int = 8
val __SIZEOF_SIZE_T__: Int = 8
val __SIZEOF_WCHAR_T__: Int = 4
val __SIZEOF_WINT_T__: Int = 4
val __SIZEOF_INT128__: Int = 16
val __INTMAX_WIDTH__: Int = 64
val __PTRDIFF_WIDTH__: Int = 64
val __INTPTR_WIDTH__: Int = 64
val __SIZE_WIDTH__: Int = 64
val __WCHAR_WIDTH__: Int = 32
val __WINT_WIDTH__: Int = 32
val __SIG_ATOMIC_WIDTH__: Int = 32
val __SIG_ATOMIC_MAX__: Int = 2147483647
val __UINTMAX_WIDTH__: Int = 64
val __UINTPTR_WIDTH__: Int = 64
val __FLT_DENORM_MIN__: Float = bitsToFloat(1) /* == 1.4E-45 */
val __FLT_HAS_DENORM__: Int = 1
val __FLT_DIG__: Int = 6
val __FLT_DECIMAL_DIG__: Int = 9
val __FLT_EPSILON__: Float = bitsToFloat(872415232) /* == 1.1920929E-7 */
val __FLT_HAS_INFINITY__: Int = 1
val __FLT_HAS_QUIET_NAN__: Int = 1
val __FLT_MANT_DIG__: Int = 24
val __FLT_MAX_10_EXP__: Int = 38
val __FLT_MAX_EXP__: Int = 128
val __FLT_MAX__: Float = bitsToFloat(2139095039) /* == 3.4028235E38 */
val __FLT_MIN_10_EXP__: Int = -37
val __FLT_MIN_EXP__: Int = -125
val __FLT_MIN__: Float = bitsToFloat(8388608) /* == 1.17549435E-38 */
val __DBL_DENORM_MIN__: Double = bitsToDouble(1) /* == 4.9E-324 */
val __DBL_HAS_DENORM__: Int = 1
val __DBL_DIG__: Int = 15
val __DBL_DECIMAL_DIG__: Int = 17
val __DBL_EPSILON__: Double = bitsToDouble(4372995238176751616) /* == 2.220446049250313E-16 */
val __DBL_HAS_INFINITY__: Int = 1
val __DBL_HAS_QUIET_NAN__: Int = 1
val __DBL_MANT_DIG__: Int = 53
val __DBL_MAX_10_EXP__: Int = 308
val __DBL_MAX_EXP__: Int = 1024
val __DBL_MAX__: Double = bitsToDouble(9218868437227405311) /* == 1.7976931348623157E308 */
val __DBL_MIN_10_EXP__: Int = -307
val __DBL_MIN_EXP__: Int = -1021
val __DBL_MIN__: Double = bitsToDouble(4503599627370496) /* == 2.2250738585072014E-308 */
val __LDBL_HAS_DENORM__: Int = 1
val __LDBL_DIG__: Int = 18
val __LDBL_DECIMAL_DIG__: Int = 21
val __LDBL_HAS_INFINITY__: Int = 1
val __LDBL_HAS_QUIET_NAN__: Int = 1
val __LDBL_MANT_DIG__: Int = 64
val __LDBL_MAX_10_EXP__: Int = 4932
val __LDBL_MAX_EXP__: Int = 16384
val __LDBL_MIN_10_EXP__: Int = -4931
val __LDBL_MIN_EXP__: Int = -16381
val __POINTER_WIDTH__: Int = 64
val __BIGGEST_ALIGNMENT__: Int = 16
val __WINT_UNSIGNED__: Int = 1
val __UINT8_MAX__: Int = 255
val __INT8_MAX__: Int = 127
val __UINT16_MAX__: Int = 65535
val __INT16_MAX__: Int = 32767
val __UINT32_MAX__: Int = -1
val __INT32_MAX__: Int = 2147483647
val __UINT64_MAX__: Long = -1
val __INT64_MAX__: Long = 9223372036854775807
val __INT_LEAST8_MAX__: Int = 127
val __UINT_LEAST8_MAX__: Int = 255
val __INT_LEAST16_MAX__: Int = 32767
val __UINT_LEAST16_MAX__: Int = 65535
val __INT_LEAST32_MAX__: Int = 2147483647
val __UINT_LEAST32_MAX__: Int = -1
val __INT_LEAST64_MAX__: Long = 9223372036854775807
val __UINT_LEAST64_MAX__: Long = -1
val __INT_FAST8_MAX__: Int = 127
val __UINT_FAST8_MAX__: Int = 255
val __INT_FAST16_MAX__: Int = 32767
val __UINT_FAST16_MAX__: Int = 65535
val __INT_FAST32_MAX__: Int = 2147483647
val __UINT_FAST32_MAX__: Int = -1
val __INT_FAST64_MAX__: Long = 9223372036854775807
val __UINT_FAST64_MAX__: Long = -1
val __FINITE_MATH_ONLY__: Int = 0
val __GNUC_STDC_INLINE__: Int = 1
val __GCC_ATOMIC_TEST_AND_SET_TRUEVAL: Int = 1
val __GCC_ATOMIC_BOOL_LOCK_FREE: Int = 2
val __GCC_ATOMIC_CHAR_LOCK_FREE: Int = 2
val __GCC_ATOMIC_CHAR16_T_LOCK_FREE: Int = 2
val __GCC_ATOMIC_CHAR32_T_LOCK_FREE: Int = 2
val __GCC_ATOMIC_WCHAR_T_LOCK_FREE: Int = 2
val __GCC_ATOMIC_SHORT_LOCK_FREE: Int = 2
val __GCC_ATOMIC_INT_LOCK_FREE: Int = 2
val __GCC_ATOMIC_LONG_LOCK_FREE: Int = 2
val __GCC_ATOMIC_LLONG_LOCK_FREE: Int = 2
val __GCC_ATOMIC_POINTER_LOCK_FREE: Int = 2
val __NO_INLINE__: Int = 1
val __FLT_EVAL_METHOD__: Int = 0
val __FLT_RADIX__: Int = 2
val __DECIMAL_DIG__: Int = 21
val __amd64__: Int = 1
val __amd64: Int = 1
val __x86_64: Int = 1
val __x86_64__: Int = 1
val __k8: Int = 1
val __k8__: Int = 1
val __tune_k8__: Int = 1
val __NO_MATH_INLINES: Int = 1
val __FXSR__: Int = 1
val __SSE2__: Int = 1
val __SSE2_MATH__: Int = 1
val __SSE__: Int = 1
val __SSE_MATH__: Int = 1
val __MMX__: Int = 1
val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_1: Int = 1
val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_2: Int = 1
val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_4: Int = 1
val __GCC_HAVE_SYNC_COMPARE_AND_SWAP_8: Int = 1
val unix: Int = 1
val __unix: Int = 1
val __unix__: Int = 1
val linux: Int = 1
val __linux: Int = 1
val __linux__: Int = 1
val __gnu_linux__: Int = 1
val __ELF__: Int = 1
val __FLOAT128__: Int = 1
val __STDC__: Int = 1
val __STDC_HOSTED__: Int = 1
val __STDC_VERSION__: Long = 201112
val __STDC_UTF_16__: Int = 1
val __STDC_UTF_32__: Int = 1
val CSFML_VERSION_MAJOR: Int = 2
val CSFML_VERSION_MINOR: Int = 3
val CSFML_VERSION_PATCH: Int = 0
val sfFalse: Int = 0
val sfTrue: Int = 1

class sfTime(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 8)
    
    var microseconds: sfInt64
        get() = memberAt<sfInt64Var>(0).value
        set(value) { memberAt<sfInt64Var>(0).value = value }
    
}

class sfClock(override val rawPtr: NativePtr) : COpaque

class sfMutex(override val rawPtr: NativePtr) : COpaque

class sfThread(override val rawPtr: NativePtr) : COpaque

class sfInputStream(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(40, 8)
    
    var read: sfInputStreamReadFunc?
        get() = memberAt<sfInputStreamReadFuncVar>(0).value
        set(value) { memberAt<sfInputStreamReadFuncVar>(0).value = value }
    
    var seek: sfInputStreamSeekFunc?
        get() = memberAt<sfInputStreamSeekFuncVar>(8).value
        set(value) { memberAt<sfInputStreamSeekFuncVar>(8).value = value }
    
    var tell: sfInputStreamTellFunc?
        get() = memberAt<sfInputStreamTellFuncVar>(16).value
        set(value) { memberAt<sfInputStreamTellFuncVar>(16).value = value }
    
    var getSize: sfInputStreamGetSizeFunc?
        get() = memberAt<sfInputStreamGetSizeFuncVar>(24).value
        set(value) { memberAt<sfInputStreamGetSizeFuncVar>(24).value = value }
    
    var userData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
}

class sfVector2i(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfVector2u(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfVector2f(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
}

class sfVector3f(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
}

class sfContext(override val rawPtr: NativePtr) : COpaque

class sfWindow(override val rawPtr: NativePtr) : COpaque

class sfJoystickIdentification(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var vendorId: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var productId: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfKeyEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var code: sfKeyCode
        get() = memberAt<sfKeyCodeVar>(4).value
        set(value) { memberAt<sfKeyCodeVar>(4).value = value }
    
    var alt: sfBool
        get() = memberAt<sfBoolVar>(8).value
        set(value) { memberAt<sfBoolVar>(8).value = value }
    
    var control: sfBool
        get() = memberAt<sfBoolVar>(12).value
        set(value) { memberAt<sfBoolVar>(12).value = value }
    
    var shift: sfBool
        get() = memberAt<sfBoolVar>(16).value
        set(value) { memberAt<sfBoolVar>(16).value = value }
    
    var system: sfBool
        get() = memberAt<sfBoolVar>(20).value
        set(value) { memberAt<sfBoolVar>(20).value = value }
    
}

class sfTextEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var unicode: sfUint32
        get() = memberAt<sfUint32Var>(4).value
        set(value) { memberAt<sfUint32Var>(4).value = value }
    
}

class sfMouseMoveEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfMouseButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var button: sfMouseButton
        get() = memberAt<sfMouseButton.Var>(4).value
        set(value) { memberAt<sfMouseButton.Var>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfMouseWheelEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var delta: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfMouseWheelScrollEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var wheel: sfMouseWheel
        get() = memberAt<sfMouseWheel.Var>(4).value
        set(value) { memberAt<sfMouseWheel.Var>(4).value = value }
    
    var delta: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}

class sfJoystickMoveEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var axis: sfJoystickAxis
        get() = memberAt<sfJoystickAxis.Var>(8).value
        set(value) { memberAt<sfJoystickAxis.Var>(8).value = value }
    
    var position: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfJoystickButtonEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var button: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfJoystickConnectEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfSizeEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var width: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfTouchEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var finger: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfSensorEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var sensorType: sfSensorType
        get() = memberAt<sfSensorType.Var>(4).value
        set(value) { memberAt<sfSensorType.Var>(4).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
    
}

class sfEvent(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    val size: sfSizeEvent
        get() = memberAt(0)
    
    val key: sfKeyEvent
        get() = memberAt(0)
    
    val text: sfTextEvent
        get() = memberAt(0)
    
    val mouseMove: sfMouseMoveEvent
        get() = memberAt(0)
    
    val mouseButton: sfMouseButtonEvent
        get() = memberAt(0)
    
    val mouseWheel: sfMouseWheelEvent
        get() = memberAt(0)
    
    val mouseWheelScroll: sfMouseWheelScrollEvent
        get() = memberAt(0)
    
    val joystickMove: sfJoystickMoveEvent
        get() = memberAt(0)
    
    val joystickButton: sfJoystickButtonEvent
        get() = memberAt(0)
    
    val joystickConnect: sfJoystickConnectEvent
        get() = memberAt(0)
    
    val touch: sfTouchEvent
        get() = memberAt(0)
    
    val sensor: sfSensorEvent
        get() = memberAt(0)
    
}

class max_align_t(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(32, 16)
    
    var __clang_max_align_nonce1: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class sfVideoMode(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(12, 4)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var bitsPerPixel: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfContextSettings(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var depthBits: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var stencilBits: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var antialiasingLevel: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var majorVersion: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var minorVersion: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var attributeFlags: sfUint32
        get() = memberAt<sfUint32Var>(20).value
        set(value) { memberAt<sfUint32Var>(20).value = value }
    
}

class sfBlendMode(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(24, 4)
    
    var colorSrcFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(0).value
        set(value) { memberAt<sfBlendFactor.Var>(0).value = value }
    
    var colorDstFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(4).value
        set(value) { memberAt<sfBlendFactor.Var>(4).value = value }
    
    var colorEquation: sfBlendEquation
        get() = memberAt<sfBlendEquation.Var>(8).value
        set(value) { memberAt<sfBlendEquation.Var>(8).value = value }
    
    var alphaSrcFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(12).value
        set(value) { memberAt<sfBlendFactor.Var>(12).value = value }
    
    var alphaDstFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(16).value
        set(value) { memberAt<sfBlendFactor.Var>(16).value = value }
    
    var alphaEquation: sfBlendEquation
        get() = memberAt<sfBlendEquation.Var>(20).value
        set(value) { memberAt<sfBlendEquation.Var>(20).value = value }
    
}

class sfColor(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(4, 1)
    
    var r: sfUint8
        get() = memberAt<sfUint8Var>(0).value
        set(value) { memberAt<sfUint8Var>(0).value = value }
    
    var g: sfUint8
        get() = memberAt<sfUint8Var>(1).value
        set(value) { memberAt<sfUint8Var>(1).value = value }
    
    var b: sfUint8
        get() = memberAt<sfUint8Var>(2).value
        set(value) { memberAt<sfUint8Var>(2).value = value }
    
    var a: sfUint8
        get() = memberAt<sfUint8Var>(3).value
        set(value) { memberAt<sfUint8Var>(3).value = value }
    
}

class sfFloatRect(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var left: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var top: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var width: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var height: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfIntRect(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(16, 4)
    
    var left: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var top: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var width: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfCircleShape(override val rawPtr: NativePtr) : COpaque

class sfConvexShape(override val rawPtr: NativePtr) : COpaque

class sfFont(override val rawPtr: NativePtr) : COpaque

class sfImage(override val rawPtr: NativePtr) : COpaque

class sfShader(override val rawPtr: NativePtr) : COpaque

class sfRectangleShape(override val rawPtr: NativePtr) : COpaque

class sfRenderTexture(override val rawPtr: NativePtr) : COpaque

class sfRenderWindow(override val rawPtr: NativePtr) : COpaque

class sfShape(override val rawPtr: NativePtr) : COpaque

class sfSprite(override val rawPtr: NativePtr) : COpaque

class sfText(override val rawPtr: NativePtr) : COpaque

class sfTexture(override val rawPtr: NativePtr) : COpaque

class sfTransformable(override val rawPtr: NativePtr) : COpaque

class sfVertexArray(override val rawPtr: NativePtr) : COpaque

class sfView(override val rawPtr: NativePtr) : COpaque

class sfTransform(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(36, 4)
    
    val matrix: CArrayPointer<FloatVar>
        get() = arrayMemberAt(0)
    
}

class sfFontInfo(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(8, 8)
    
    var family: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
}

class sfGlyph(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(36, 4)
    
    var advance: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    val bounds: sfFloatRect
        get() = memberAt(4)
    
    val textureRect: sfIntRect
        get() = memberAt(20)
    
}

class sfRenderStates(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(80, 8)
    
    val blendMode: sfBlendMode
        get() = memberAt(0)
    
    val transform: sfTransform
        get() = memberAt(24)
    
    var texture: CPointer<sfTexture>?
        get() = memberAt<CPointerVar<sfTexture>>(64).value
        set(value) { memberAt<CPointerVar<sfTexture>>(64).value = value }
    
    var shader: CPointer<sfShader>?
        get() = memberAt<CPointerVar<sfShader>>(72).value
        set(value) { memberAt<CPointerVar<sfShader>>(72).value = value }
    
}

class sfVertex(override val rawPtr: NativePtr) : CStructVar() {
    
    companion object : Type(20, 4)
    
    val position: sfVector2f
        get() = memberAt(0)
    
    val color: sfColor
        get() = memberAt(8)
    
    val texCoords: sfVector2f
        get() = memberAt(12)
    
}

// enum (anonymous at /usr/include/SFML/Window/Joystick.h:39:1):
val sfJoystickCount: Int = 8
val sfJoystickButtonCount: Int = 32
val sfJoystickAxisCount: Int = 8

enum class sfJoystickAxis(override val value: Int) : CEnum {
    sfJoystickX(0),
    sfJoystickY(1),
    sfJoystickZ(2),
    sfJoystickR(3),
    sfJoystickU(4),
    sfJoystickV(5),
    sfJoystickPovX(6),
    sfJoystickPovY(7),
    ;
    
    companion object {
        fun byValue(value: Int) = sfJoystickAxis.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfJoystickAxis
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfKeyCodeVar = IntVarOf<sfKeyCode>
typealias sfKeyCode = Int

val sfKeyUnknown: sfKeyCode = -1
val sfKeyA: sfKeyCode = 0
val sfKeyB: sfKeyCode = 1
val sfKeyC: sfKeyCode = 2
val sfKeyD: sfKeyCode = 3
val sfKeyE: sfKeyCode = 4
val sfKeyF: sfKeyCode = 5
val sfKeyG: sfKeyCode = 6
val sfKeyH: sfKeyCode = 7
val sfKeyI: sfKeyCode = 8
val sfKeyJ: sfKeyCode = 9
val sfKeyK: sfKeyCode = 10
val sfKeyL: sfKeyCode = 11
val sfKeyM: sfKeyCode = 12
val sfKeyN: sfKeyCode = 13
val sfKeyO: sfKeyCode = 14
val sfKeyP: sfKeyCode = 15
val sfKeyQ: sfKeyCode = 16
val sfKeyR: sfKeyCode = 17
val sfKeyS: sfKeyCode = 18
val sfKeyT: sfKeyCode = 19
val sfKeyU: sfKeyCode = 20
val sfKeyV: sfKeyCode = 21
val sfKeyW: sfKeyCode = 22
val sfKeyX: sfKeyCode = 23
val sfKeyY: sfKeyCode = 24
val sfKeyZ: sfKeyCode = 25
val sfKeyNum0: sfKeyCode = 26
val sfKeyNum1: sfKeyCode = 27
val sfKeyNum2: sfKeyCode = 28
val sfKeyNum3: sfKeyCode = 29
val sfKeyNum4: sfKeyCode = 30
val sfKeyNum5: sfKeyCode = 31
val sfKeyNum6: sfKeyCode = 32
val sfKeyNum7: sfKeyCode = 33
val sfKeyNum8: sfKeyCode = 34
val sfKeyNum9: sfKeyCode = 35
val sfKeyEscape: sfKeyCode = 36
val sfKeyLControl: sfKeyCode = 37
val sfKeyLShift: sfKeyCode = 38
val sfKeyLAlt: sfKeyCode = 39
val sfKeyLSystem: sfKeyCode = 40
val sfKeyRControl: sfKeyCode = 41
val sfKeyRShift: sfKeyCode = 42
val sfKeyRAlt: sfKeyCode = 43
val sfKeyRSystem: sfKeyCode = 44
val sfKeyMenu: sfKeyCode = 45
val sfKeyLBracket: sfKeyCode = 46
val sfKeyRBracket: sfKeyCode = 47
val sfKeySemiColon: sfKeyCode = 48
val sfKeyComma: sfKeyCode = 49
val sfKeyPeriod: sfKeyCode = 50
val sfKeyQuote: sfKeyCode = 51
val sfKeySlash: sfKeyCode = 52
val sfKeyBackSlash: sfKeyCode = 53
val sfKeyTilde: sfKeyCode = 54
val sfKeyEqual: sfKeyCode = 55
val sfKeyDash: sfKeyCode = 56
val sfKeySpace: sfKeyCode = 57
val sfKeyReturn: sfKeyCode = 58
val sfKeyBack: sfKeyCode = 59
val sfKeyTab: sfKeyCode = 60
val sfKeyPageUp: sfKeyCode = 61
val sfKeyPageDown: sfKeyCode = 62
val sfKeyEnd: sfKeyCode = 63
val sfKeyHome: sfKeyCode = 64
val sfKeyInsert: sfKeyCode = 65
val sfKeyDelete: sfKeyCode = 66
val sfKeyAdd: sfKeyCode = 67
val sfKeySubtract: sfKeyCode = 68
val sfKeyMultiply: sfKeyCode = 69
val sfKeyDivide: sfKeyCode = 70
val sfKeyLeft: sfKeyCode = 71
val sfKeyRight: sfKeyCode = 72
val sfKeyUp: sfKeyCode = 73
val sfKeyDown: sfKeyCode = 74
val sfKeyNumpad0: sfKeyCode = 75
val sfKeyNumpad1: sfKeyCode = 76
val sfKeyNumpad2: sfKeyCode = 77
val sfKeyNumpad3: sfKeyCode = 78
val sfKeyNumpad4: sfKeyCode = 79
val sfKeyNumpad5: sfKeyCode = 80
val sfKeyNumpad6: sfKeyCode = 81
val sfKeyNumpad7: sfKeyCode = 82
val sfKeyNumpad8: sfKeyCode = 83
val sfKeyNumpad9: sfKeyCode = 84
val sfKeyF1: sfKeyCode = 85
val sfKeyF2: sfKeyCode = 86
val sfKeyF3: sfKeyCode = 87
val sfKeyF4: sfKeyCode = 88
val sfKeyF5: sfKeyCode = 89
val sfKeyF6: sfKeyCode = 90
val sfKeyF7: sfKeyCode = 91
val sfKeyF8: sfKeyCode = 92
val sfKeyF9: sfKeyCode = 93
val sfKeyF10: sfKeyCode = 94
val sfKeyF11: sfKeyCode = 95
val sfKeyF12: sfKeyCode = 96
val sfKeyF13: sfKeyCode = 97
val sfKeyF14: sfKeyCode = 98
val sfKeyF15: sfKeyCode = 99
val sfKeyPause: sfKeyCode = 100
val sfKeyCount: sfKeyCode = 101

enum class sfMouseButton(override val value: Int) : CEnum {
    sfMouseLeft(0),
    sfMouseRight(1),
    sfMouseMiddle(2),
    sfMouseXButton1(3),
    sfMouseXButton2(4),
    sfMouseButtonCount(5),
    ;
    
    companion object {
        fun byValue(value: Int) = sfMouseButton.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfMouseButton
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfMouseWheel(override val value: Int) : CEnum {
    sfMouseVerticalWheel(0),
    sfMouseHorizontalWheel(1),
    ;
    
    companion object {
        fun byValue(value: Int) = sfMouseWheel.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfMouseWheel
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfSensorType(override val value: Int) : CEnum {
    sfSensorAccelerometer(0),
    sfSensorGyroscope(1),
    sfSensorMagnetometer(2),
    sfSensorGravity(3),
    sfSensorUserAcceleration(4),
    sfSensorOrientation(5),
    sfSensorCount(6),
    ;
    
    companion object {
        fun byValue(value: Int) = sfSensorType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfSensorType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfEventType(override val value: Int) : CEnum {
    sfEvtClosed(0),
    sfEvtResized(1),
    sfEvtLostFocus(2),
    sfEvtGainedFocus(3),
    sfEvtTextEntered(4),
    sfEvtKeyPressed(5),
    sfEvtKeyReleased(6),
    sfEvtMouseWheelMoved(7),
    sfEvtMouseWheelScrolled(8),
    sfEvtMouseButtonPressed(9),
    sfEvtMouseButtonReleased(10),
    sfEvtMouseMoved(11),
    sfEvtMouseEntered(12),
    sfEvtMouseLeft(13),
    sfEvtJoystickButtonPressed(14),
    sfEvtJoystickButtonReleased(15),
    sfEvtJoystickMoved(16),
    sfEvtJoystickConnected(17),
    sfEvtJoystickDisconnected(18),
    sfEvtTouchBegan(19),
    sfEvtTouchMoved(20),
    sfEvtTouchEnded(21),
    sfEvtSensorChanged(22),
    sfEvtCount(23),
    ;
    
    companion object {
        fun byValue(value: Int) = sfEventType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfEventType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfWindowStyleVar = IntVarOf<sfWindowStyle>
typealias sfWindowStyle = Int

val sfNone: sfWindowStyle = 0
val sfTitlebar: sfWindowStyle = 1
val sfResize: sfWindowStyle = 2
val sfClose: sfWindowStyle = 4
val sfFullscreen: sfWindowStyle = 8
val sfDefaultStyle: sfWindowStyle = 7

typealias sfContextAttributeVar = IntVarOf<sfContextAttribute>
typealias sfContextAttribute = Int

val sfContextDefault: sfContextAttribute = 0
val sfContextCore: sfContextAttribute = 1
val sfContextDebug: sfContextAttribute = 4

enum class sfBlendFactor(override val value: Int) : CEnum {
    sfBlendFactorZero(0),
    sfBlendFactorOne(1),
    sfBlendFactorSrcColor(2),
    sfBlendFactorOneMinusSrcColor(3),
    sfBlendFactorDstColor(4),
    sfBlendFactorOneMinusDstColor(5),
    sfBlendFactorSrcAlpha(6),
    sfBlendFactorOneMinusSrcAlpha(7),
    sfBlendFactorDstAlpha(8),
    sfBlendFactorOneMinusDstAlpha(9),
    ;
    
    companion object {
        fun byValue(value: Int) = sfBlendFactor.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfBlendFactor
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfBlendEquation(override val value: Int) : CEnum {
    sfBlendEquationAdd(0),
    sfBlendEquationSubtract(1),
    ;
    
    companion object {
        fun byValue(value: Int) = sfBlendEquation.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfBlendEquation
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class sfPrimitiveType(override val value: Int) : CEnum {
    sfPoints(0),
    sfLines(1),
    sfLinesStrip(2),
    sfTriangles(3),
    sfTrianglesStrip(4),
    sfTrianglesFan(5),
    sfQuads(6),
    ;
    
    companion object {
        fun byValue(value: Int) = sfPrimitiveType.values().find { it.value == value }!!
    }
    
    class Var(override val rawPtr: NativePtr) : CEnumVar() {
        companion object : Type(IntVar.size.toInt())
        var value: sfPrimitiveType
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias sfTextStyleVar = IntVarOf<sfTextStyle>
typealias sfTextStyle = Int

val sfTextRegular: sfTextStyle = 0
val sfTextBold: sfTextStyle = 1
val sfTextItalic: sfTextStyle = 2
val sfTextUnderlined: sfTextStyle = 4
val sfTextStrikeThrough: sfTextStyle = 8

typealias sfBoolVar = IntVarOf<sfBool>
typealias sfBool = Int

typealias sfInt8Var = ByteVarOf<sfInt8>
typealias sfInt8 = Byte

typealias sfUint8Var = ByteVarOf<sfUint8>
typealias sfUint8 = Byte

typealias sfInt16Var = ShortVarOf<sfInt16>
typealias sfInt16 = Short

typealias sfUint16Var = ShortVarOf<sfUint16>
typealias sfUint16 = Short

typealias sfInt32Var = IntVarOf<sfInt32>
typealias sfInt32 = Int

typealias sfUint32Var = IntVarOf<sfUint32>
typealias sfUint32 = Int

typealias sfInt64Var = LongVarOf<sfInt64>
typealias sfInt64 = Long

typealias sfUint64Var = LongVarOf<sfUint64>
typealias sfUint64 = Long

typealias sfInputStreamReadFuncVar = CPointerVarOf<sfInputStreamReadFunc>
typealias sfInputStreamReadFunc = CPointer<CFunction<CFunctionType4>>

typealias sfInputStreamSeekFuncVar = CPointerVarOf<sfInputStreamSeekFunc>
typealias sfInputStreamSeekFunc = CPointer<CFunction<CFunctionType5>>

typealias sfInputStreamTellFuncVar = CPointerVarOf<sfInputStreamTellFunc>
typealias sfInputStreamTellFunc = CPointer<CFunction<CFunctionType6>>

typealias sfInputStreamGetSizeFuncVar = CPointerVarOf<sfInputStreamGetSizeFunc>
typealias sfInputStreamGetSizeFunc = CPointer<CFunction<CFunctionType6>>

typealias ptrdiff_tVar = LongVarOf<ptrdiff_t>
typealias ptrdiff_t = Long

typealias size_tVar = LongVarOf<size_t>
typealias size_t = Long

typealias wchar_tVar = IntVarOf<wchar_t>
typealias wchar_t = Int

typealias sfWindowHandleVar = LongVarOf<sfWindowHandle>
typealias sfWindowHandle = Long

typealias sfShapeGetPointCountCallbackVar = CPointerVarOf<sfShapeGetPointCountCallback>
typealias sfShapeGetPointCountCallback = CPointer<CFunction<CFunctionType2>>

typealias sfShapeGetPointCallbackVar = CPointerVarOf<sfShapeGetPointCallback>
typealias sfShapeGetPointCallback = CPointer<CFunction<CFunctionType3>>

object CFunctionType1 : CTriviallyAdaptedFunctionType<(COpaquePointer?) -> Unit>()

object CFunctionType2 : CTriviallyAdaptedFunctionType<(COpaquePointer?) -> Long>()

object CFunctionType3 : CFunctionType {}

object CFunctionType4 : CTriviallyAdaptedFunctionType<(COpaquePointer?, Long, COpaquePointer?) -> Long>()

object CFunctionType5 : CTriviallyAdaptedFunctionType<(Long, COpaquePointer?) -> Long>()

object CFunctionType6 : CTriviallyAdaptedFunctionType<(COpaquePointer?) -> Long>()

@SymbolName("kni_sfml_sfTime_asSeconds")
private external fun kni_sfTime_asSeconds(time: NativePtr): Float

@SymbolName("kni_sfml_sfTime_asMilliseconds")
private external fun kni_sfTime_asMilliseconds(time: NativePtr): Int

@SymbolName("kni_sfml_sfTime_asMicroseconds")
private external fun kni_sfTime_asMicroseconds(time: NativePtr): Long

@SymbolName("kni_sfml_sfSeconds")
private external fun kni_sfSeconds(amount: Float, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMilliseconds")
private external fun kni_sfMilliseconds(amount: Int, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMicroseconds")
private external fun kni_sfMicroseconds(amount: Long, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfClock_copy")
private external fun kni_sfClock_copy(clock: NativePtr): NativePtr

@SymbolName("kni_sfml_sfClock_destroy")
private external fun kni_sfClock_destroy(clock: NativePtr): Unit

@SymbolName("kni_sfml_sfClock_getElapsedTime")
private external fun kni_sfClock_getElapsedTime(clock: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfClock_restart")
private external fun kni_sfClock_restart(clock: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMutex_destroy")
private external fun kni_sfMutex_destroy(mutex: NativePtr): Unit

@SymbolName("kni_sfml_sfMutex_lock")
private external fun kni_sfMutex_lock(mutex: NativePtr): Unit

@SymbolName("kni_sfml_sfMutex_unlock")
private external fun kni_sfMutex_unlock(mutex: NativePtr): Unit

@SymbolName("kni_sfml_sfSleep")
private external fun kni_sfSleep(duration: NativePtr): Unit

@SymbolName("kni_sfml_sfThread_destroy")
private external fun kni_sfThread_destroy(thread: NativePtr): Unit

@SymbolName("kni_sfml_sfThread_launch")
private external fun kni_sfThread_launch(thread: NativePtr): Unit

@SymbolName("kni_sfml_sfThread_wait")
private external fun kni_sfThread_wait(thread: NativePtr): Unit

@SymbolName("kni_sfml_sfThread_terminate")
private external fun kni_sfThread_terminate(thread: NativePtr): Unit

@SymbolName("kni_sfml_sfContext_destroy")
private external fun kni_sfContext_destroy(context: NativePtr): Unit

@SymbolName("kni_sfml_sfContext_setActive")
private external fun kni_sfContext_setActive(context: NativePtr, active: Int): Unit

@SymbolName("kni_sfml_sfJoystick_getIdentification")
private external fun kni_sfJoystick_getIdentification(joystick: Int, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMouse_getPosition")
private external fun kni_sfMouse_getPosition(relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMouse_setPosition")
private external fun kni_sfMouse_setPosition(position: NativePtr, relativeTo: NativePtr): Unit

@SymbolName("kni_sfml_sfSensor_getValue")
private external fun kni_sfSensor_getValue(sensor: Int, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTouch_getPosition")
private external fun kni_sfTouch_getPosition(finger: Int, relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfVideoMode_getDesktopMode")
private external fun kni_sfVideoMode_getDesktopMode(retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfVideoMode_getFullscreenModes")
private external fun kni_sfVideoMode_getFullscreenModes(Count: NativePtr): NativePtr

@SymbolName("kni_sfml_sfVideoMode_isValid")
private external fun kni_sfVideoMode_isValid(mode: NativePtr): Int

@SymbolName("kni_sfml_sfWindow_create")
private external fun kni_sfWindow_create(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

@SymbolName("kni_sfml_sfWindow_createUnicode")
private external fun kni_sfWindow_createUnicode(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

@SymbolName("kni_sfml_sfWindow_createFromHandle")
private external fun kni_sfWindow_createFromHandle(handle: Long, settings: NativePtr): NativePtr

@SymbolName("kni_sfml_sfWindow_destroy")
private external fun kni_sfWindow_destroy(window: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_close")
private external fun kni_sfWindow_close(window: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_isOpen")
private external fun kni_sfWindow_isOpen(window: NativePtr): Int

@SymbolName("kni_sfml_sfWindow_getSettings")
private external fun kni_sfWindow_getSettings(window: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfWindow_pollEvent")
private external fun kni_sfWindow_pollEvent(window: NativePtr, event: NativePtr): Int

@SymbolName("kni_sfml_sfWindow_waitEvent")
private external fun kni_sfWindow_waitEvent(window: NativePtr, event: NativePtr): Int

@SymbolName("kni_sfml_sfWindow_getPosition")
private external fun kni_sfWindow_getPosition(window: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfWindow_setPosition")
private external fun kni_sfWindow_setPosition(window: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_getSize")
private external fun kni_sfWindow_getSize(window: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfWindow_setSize")
private external fun kni_sfWindow_setSize(window: NativePtr, size: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_setTitle")
private external fun kni_sfWindow_setTitle(window: NativePtr, title: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_setUnicodeTitle")
private external fun kni_sfWindow_setUnicodeTitle(window: NativePtr, title: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_setIcon")
private external fun kni_sfWindow_setIcon(window: NativePtr, width: Int, height: Int, pixels: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_setVisible")
private external fun kni_sfWindow_setVisible(window: NativePtr, visible: Int): Unit

@SymbolName("kni_sfml_sfWindow_setMouseCursorVisible")
private external fun kni_sfWindow_setMouseCursorVisible(window: NativePtr, visible: Int): Unit

@SymbolName("kni_sfml_sfWindow_setVerticalSyncEnabled")
private external fun kni_sfWindow_setVerticalSyncEnabled(window: NativePtr, enabled: Int): Unit

@SymbolName("kni_sfml_sfWindow_setKeyRepeatEnabled")
private external fun kni_sfWindow_setKeyRepeatEnabled(window: NativePtr, enabled: Int): Unit

@SymbolName("kni_sfml_sfWindow_setActive")
private external fun kni_sfWindow_setActive(window: NativePtr, active: Int): Int

@SymbolName("kni_sfml_sfWindow_requestFocus")
private external fun kni_sfWindow_requestFocus(window: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_hasFocus")
private external fun kni_sfWindow_hasFocus(window: NativePtr): Int

@SymbolName("kni_sfml_sfWindow_display")
private external fun kni_sfWindow_display(window: NativePtr): Unit

@SymbolName("kni_sfml_sfWindow_setFramerateLimit")
private external fun kni_sfWindow_setFramerateLimit(window: NativePtr, limit: Int): Unit

@SymbolName("kni_sfml_sfWindow_setJoystickThreshold")
private external fun kni_sfWindow_setJoystickThreshold(window: NativePtr, threshold: Float): Unit

@SymbolName("kni_sfml_sfWindow_getSystemHandle")
private external fun kni_sfWindow_getSystemHandle(window: NativePtr): Long

@SymbolName("kni_sfml_sfColor_fromRGB")
private external fun kni_sfColor_fromRGB(red: Byte, green: Byte, blue: Byte, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfColor_fromRGBA")
private external fun kni_sfColor_fromRGBA(red: Byte, green: Byte, blue: Byte, alpha: Byte, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfColor_fromInteger")
private external fun kni_sfColor_fromInteger(color: Int, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfColor_toInteger")
private external fun kni_sfColor_toInteger(color: NativePtr): Int

@SymbolName("kni_sfml_sfColor_add")
private external fun kni_sfColor_add(color1: NativePtr, color2: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfColor_subtract")
private external fun kni_sfColor_subtract(color1: NativePtr, color2: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfColor_modulate")
private external fun kni_sfColor_modulate(color1: NativePtr, color2: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfFloatRect_contains")
private external fun kni_sfFloatRect_contains(rect: NativePtr, x: Float, y: Float): Int

@SymbolName("kni_sfml_sfIntRect_contains")
private external fun kni_sfIntRect_contains(rect: NativePtr, x: Int, y: Int): Int

@SymbolName("kni_sfml_sfFloatRect_intersects")
private external fun kni_sfFloatRect_intersects(rect1: NativePtr, rect2: NativePtr, intersection: NativePtr): Int

@SymbolName("kni_sfml_sfIntRect_intersects")
private external fun kni_sfIntRect_intersects(rect1: NativePtr, rect2: NativePtr, intersection: NativePtr): Int

@SymbolName("kni_sfml_sfTransform_fromMatrix")
private external fun kni_sfTransform_fromMatrix(a00: Float, a01: Float, a02: Float, a10: Float, a11: Float, a12: Float, a20: Float, a21: Float, a22: Float, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransform_getMatrix")
private external fun kni_sfTransform_getMatrix(transform: NativePtr, matrix: NativePtr): Unit

@SymbolName("kni_sfml_sfTransform_getInverse")
private external fun kni_sfTransform_getInverse(transform: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransform_transformPoint")
private external fun kni_sfTransform_transformPoint(transform: NativePtr, point: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransform_transformRect")
private external fun kni_sfTransform_transformRect(transform: NativePtr, rectangle: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransform_combine")
private external fun kni_sfTransform_combine(transform: NativePtr, other: NativePtr): Unit

@SymbolName("kni_sfml_sfTransform_translate")
private external fun kni_sfTransform_translate(transform: NativePtr, x: Float, y: Float): Unit

@SymbolName("kni_sfml_sfTransform_rotate")
private external fun kni_sfTransform_rotate(transform: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfTransform_rotateWithCenter")
private external fun kni_sfTransform_rotateWithCenter(transform: NativePtr, angle: Float, centerX: Float, centerY: Float): Unit

@SymbolName("kni_sfml_sfTransform_scale")
private external fun kni_sfTransform_scale(transform: NativePtr, scaleX: Float, scaleY: Float): Unit

@SymbolName("kni_sfml_sfTransform_scaleWithCenter")
private external fun kni_sfTransform_scaleWithCenter(transform: NativePtr, scaleX: Float, scaleY: Float, centerX: Float, centerY: Float): Unit

@SymbolName("kni_sfml_sfCircleShape_copy")
private external fun kni_sfCircleShape_copy(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_destroy")
private external fun kni_sfCircleShape_destroy(shape: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_setPosition")
private external fun kni_sfCircleShape_setPosition(shape: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_setRotation")
private external fun kni_sfCircleShape_setRotation(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfCircleShape_setScale")
private external fun kni_sfCircleShape_setScale(shape: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_setOrigin")
private external fun kni_sfCircleShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_getPosition")
private external fun kni_sfCircleShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getRotation")
private external fun kni_sfCircleShape_getRotation(shape: NativePtr): Float

@SymbolName("kni_sfml_sfCircleShape_getScale")
private external fun kni_sfCircleShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getOrigin")
private external fun kni_sfCircleShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_move")
private external fun kni_sfCircleShape_move(shape: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_rotate")
private external fun kni_sfCircleShape_rotate(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfCircleShape_scale")
private external fun kni_sfCircleShape_scale(shape: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_getTransform")
private external fun kni_sfCircleShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getInverseTransform")
private external fun kni_sfCircleShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_setTexture")
private external fun kni_sfCircleShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

@SymbolName("kni_sfml_sfCircleShape_setTextureRect")
private external fun kni_sfCircleShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_setFillColor")
private external fun kni_sfCircleShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_setOutlineColor")
private external fun kni_sfCircleShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfCircleShape_setOutlineThickness")
private external fun kni_sfCircleShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

@SymbolName("kni_sfml_sfCircleShape_getTexture")
private external fun kni_sfCircleShape_getTexture(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getTextureRect")
private external fun kni_sfCircleShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getFillColor")
private external fun kni_sfCircleShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getOutlineColor")
private external fun kni_sfCircleShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getOutlineThickness")
private external fun kni_sfCircleShape_getOutlineThickness(shape: NativePtr): Float

@SymbolName("kni_sfml_sfCircleShape_getPointCount")
private external fun kni_sfCircleShape_getPointCount(shape: NativePtr): Long

@SymbolName("kni_sfml_sfCircleShape_getPoint")
private external fun kni_sfCircleShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_setRadius")
private external fun kni_sfCircleShape_setRadius(shape: NativePtr, radius: Float): Unit

@SymbolName("kni_sfml_sfCircleShape_getRadius")
private external fun kni_sfCircleShape_getRadius(shape: NativePtr): Float

@SymbolName("kni_sfml_sfCircleShape_setPointCount")
private external fun kni_sfCircleShape_setPointCount(shape: NativePtr, count: Long): Unit

@SymbolName("kni_sfml_sfCircleShape_getLocalBounds")
private external fun kni_sfCircleShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfCircleShape_getGlobalBounds")
private external fun kni_sfCircleShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_copy")
private external fun kni_sfConvexShape_copy(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_destroy")
private external fun kni_sfConvexShape_destroy(shape: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_setPosition")
private external fun kni_sfConvexShape_setPosition(shape: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_setRotation")
private external fun kni_sfConvexShape_setRotation(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfConvexShape_setScale")
private external fun kni_sfConvexShape_setScale(shape: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_setOrigin")
private external fun kni_sfConvexShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_getPosition")
private external fun kni_sfConvexShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getRotation")
private external fun kni_sfConvexShape_getRotation(shape: NativePtr): Float

@SymbolName("kni_sfml_sfConvexShape_getScale")
private external fun kni_sfConvexShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getOrigin")
private external fun kni_sfConvexShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_move")
private external fun kni_sfConvexShape_move(shape: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_rotate")
private external fun kni_sfConvexShape_rotate(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfConvexShape_scale")
private external fun kni_sfConvexShape_scale(shape: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_getTransform")
private external fun kni_sfConvexShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getInverseTransform")
private external fun kni_sfConvexShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_setTexture")
private external fun kni_sfConvexShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

@SymbolName("kni_sfml_sfConvexShape_setTextureRect")
private external fun kni_sfConvexShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_setFillColor")
private external fun kni_sfConvexShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_setOutlineColor")
private external fun kni_sfConvexShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_setOutlineThickness")
private external fun kni_sfConvexShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

@SymbolName("kni_sfml_sfConvexShape_getTexture")
private external fun kni_sfConvexShape_getTexture(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getTextureRect")
private external fun kni_sfConvexShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getFillColor")
private external fun kni_sfConvexShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getOutlineColor")
private external fun kni_sfConvexShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getOutlineThickness")
private external fun kni_sfConvexShape_getOutlineThickness(shape: NativePtr): Float

@SymbolName("kni_sfml_sfConvexShape_getPointCount")
private external fun kni_sfConvexShape_getPointCount(shape: NativePtr): Long

@SymbolName("kni_sfml_sfConvexShape_getPoint")
private external fun kni_sfConvexShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_setPointCount")
private external fun kni_sfConvexShape_setPointCount(shape: NativePtr, count: Long): Unit

@SymbolName("kni_sfml_sfConvexShape_setPoint")
private external fun kni_sfConvexShape_setPoint(shape: NativePtr, index: Long, point: NativePtr): Unit

@SymbolName("kni_sfml_sfConvexShape_getLocalBounds")
private external fun kni_sfConvexShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfConvexShape_getGlobalBounds")
private external fun kni_sfConvexShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfFont_createFromFile")
private external fun kni_sfFont_createFromFile(filename: NativePtr): NativePtr

@SymbolName("kni_sfml_sfFont_createFromStream")
private external fun kni_sfFont_createFromStream(stream: NativePtr): NativePtr

@SymbolName("kni_sfml_sfFont_copy")
private external fun kni_sfFont_copy(font: NativePtr): NativePtr

@SymbolName("kni_sfml_sfFont_destroy")
private external fun kni_sfFont_destroy(font: NativePtr): Unit

@SymbolName("kni_sfml_sfFont_getGlyph")
private external fun kni_sfFont_getGlyph(font: NativePtr, codePoint: Int, characterSize: Int, bold: Int, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfFont_getKerning")
private external fun kni_sfFont_getKerning(font: NativePtr, first: Int, second: Int, characterSize: Int): Float

@SymbolName("kni_sfml_sfFont_getLineSpacing")
private external fun kni_sfFont_getLineSpacing(font: NativePtr, characterSize: Int): Float

@SymbolName("kni_sfml_sfFont_getUnderlinePosition")
private external fun kni_sfFont_getUnderlinePosition(font: NativePtr, characterSize: Int): Float

@SymbolName("kni_sfml_sfFont_getUnderlineThickness")
private external fun kni_sfFont_getUnderlineThickness(font: NativePtr, characterSize: Int): Float

@SymbolName("kni_sfml_sfFont_getTexture")
private external fun kni_sfFont_getTexture(font: NativePtr, characterSize: Int): NativePtr

@SymbolName("kni_sfml_sfFont_getInfo")
private external fun kni_sfFont_getInfo(font: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_createFromColor")
private external fun kni_sfImage_createFromColor(width: Int, height: Int, color: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_createFromPixels")
private external fun kni_sfImage_createFromPixels(width: Int, height: Int, pixels: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_createFromFile")
private external fun kni_sfImage_createFromFile(filename: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_createFromStream")
private external fun kni_sfImage_createFromStream(stream: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_copy")
private external fun kni_sfImage_copy(image: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_destroy")
private external fun kni_sfImage_destroy(image: NativePtr): Unit

@SymbolName("kni_sfml_sfImage_saveToFile")
private external fun kni_sfImage_saveToFile(image: NativePtr, filename: NativePtr): Int

@SymbolName("kni_sfml_sfImage_getSize")
private external fun kni_sfImage_getSize(image: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_createMaskFromColor")
private external fun kni_sfImage_createMaskFromColor(image: NativePtr, color: NativePtr, alpha: Byte): Unit

@SymbolName("kni_sfml_sfImage_copyImage")
private external fun kni_sfImage_copyImage(image: NativePtr, source: NativePtr, destX: Int, destY: Int, sourceRect: NativePtr, applyAlpha: Int): Unit

@SymbolName("kni_sfml_sfImage_setPixel")
private external fun kni_sfImage_setPixel(image: NativePtr, x: Int, y: Int, color: NativePtr): Unit

@SymbolName("kni_sfml_sfImage_getPixel")
private external fun kni_sfImage_getPixel(image: NativePtr, x: Int, y: Int, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_getPixelsPtr")
private external fun kni_sfImage_getPixelsPtr(image: NativePtr): NativePtr

@SymbolName("kni_sfml_sfImage_flipHorizontally")
private external fun kni_sfImage_flipHorizontally(image: NativePtr): Unit

@SymbolName("kni_sfml_sfImage_flipVertically")
private external fun kni_sfImage_flipVertically(image: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_copy")
private external fun kni_sfRectangleShape_copy(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_destroy")
private external fun kni_sfRectangleShape_destroy(shape: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_setPosition")
private external fun kni_sfRectangleShape_setPosition(shape: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_setRotation")
private external fun kni_sfRectangleShape_setRotation(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfRectangleShape_setScale")
private external fun kni_sfRectangleShape_setScale(shape: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_setOrigin")
private external fun kni_sfRectangleShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_getPosition")
private external fun kni_sfRectangleShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getRotation")
private external fun kni_sfRectangleShape_getRotation(shape: NativePtr): Float

@SymbolName("kni_sfml_sfRectangleShape_getScale")
private external fun kni_sfRectangleShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getOrigin")
private external fun kni_sfRectangleShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_move")
private external fun kni_sfRectangleShape_move(shape: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_rotate")
private external fun kni_sfRectangleShape_rotate(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfRectangleShape_scale")
private external fun kni_sfRectangleShape_scale(shape: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_getTransform")
private external fun kni_sfRectangleShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getInverseTransform")
private external fun kni_sfRectangleShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_setTexture")
private external fun kni_sfRectangleShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

@SymbolName("kni_sfml_sfRectangleShape_setTextureRect")
private external fun kni_sfRectangleShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_setFillColor")
private external fun kni_sfRectangleShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_setOutlineColor")
private external fun kni_sfRectangleShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_setOutlineThickness")
private external fun kni_sfRectangleShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

@SymbolName("kni_sfml_sfRectangleShape_getTexture")
private external fun kni_sfRectangleShape_getTexture(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getTextureRect")
private external fun kni_sfRectangleShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getFillColor")
private external fun kni_sfRectangleShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getOutlineColor")
private external fun kni_sfRectangleShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getOutlineThickness")
private external fun kni_sfRectangleShape_getOutlineThickness(shape: NativePtr): Float

@SymbolName("kni_sfml_sfRectangleShape_getPointCount")
private external fun kni_sfRectangleShape_getPointCount(shape: NativePtr): Long

@SymbolName("kni_sfml_sfRectangleShape_getPoint")
private external fun kni_sfRectangleShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_setSize")
private external fun kni_sfRectangleShape_setSize(shape: NativePtr, size: NativePtr): Unit

@SymbolName("kni_sfml_sfRectangleShape_getSize")
private external fun kni_sfRectangleShape_getSize(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getLocalBounds")
private external fun kni_sfRectangleShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRectangleShape_getGlobalBounds")
private external fun kni_sfRectangleShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_destroy")
private external fun kni_sfRenderTexture_destroy(renderTexture: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_getSize")
private external fun kni_sfRenderTexture_getSize(renderTexture: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_setActive")
private external fun kni_sfRenderTexture_setActive(renderTexture: NativePtr, active: Int): Int

@SymbolName("kni_sfml_sfRenderTexture_display")
private external fun kni_sfRenderTexture_display(renderTexture: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_clear")
private external fun kni_sfRenderTexture_clear(renderTexture: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_setView")
private external fun kni_sfRenderTexture_setView(renderTexture: NativePtr, view: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_getView")
private external fun kni_sfRenderTexture_getView(renderTexture: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_getDefaultView")
private external fun kni_sfRenderTexture_getDefaultView(renderTexture: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_getViewport")
private external fun kni_sfRenderTexture_getViewport(renderTexture: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_mapPixelToCoords")
private external fun kni_sfRenderTexture_mapPixelToCoords(renderTexture: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_mapCoordsToPixel")
private external fun kni_sfRenderTexture_mapCoordsToPixel(renderTexture: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_drawSprite")
private external fun kni_sfRenderTexture_drawSprite(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawText")
private external fun kni_sfRenderTexture_drawText(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawShape")
private external fun kni_sfRenderTexture_drawShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawCircleShape")
private external fun kni_sfRenderTexture_drawCircleShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawConvexShape")
private external fun kni_sfRenderTexture_drawConvexShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawRectangleShape")
private external fun kni_sfRenderTexture_drawRectangleShape(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawVertexArray")
private external fun kni_sfRenderTexture_drawVertexArray(renderTexture: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_drawPrimitives")
private external fun kni_sfRenderTexture_drawPrimitives(renderTexture: NativePtr, vertices: NativePtr, vertexCount: Long, type: Int, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_pushGLStates")
private external fun kni_sfRenderTexture_pushGLStates(renderTexture: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_popGLStates")
private external fun kni_sfRenderTexture_popGLStates(renderTexture: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_resetGLStates")
private external fun kni_sfRenderTexture_resetGLStates(renderTexture: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderTexture_getTexture")
private external fun kni_sfRenderTexture_getTexture(renderTexture: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderTexture_setSmooth")
private external fun kni_sfRenderTexture_setSmooth(renderTexture: NativePtr, smooth: Int): Unit

@SymbolName("kni_sfml_sfRenderTexture_isSmooth")
private external fun kni_sfRenderTexture_isSmooth(renderTexture: NativePtr): Int

@SymbolName("kni_sfml_sfRenderTexture_setRepeated")
private external fun kni_sfRenderTexture_setRepeated(renderTexture: NativePtr, repeated: Int): Unit

@SymbolName("kni_sfml_sfRenderTexture_isRepeated")
private external fun kni_sfRenderTexture_isRepeated(renderTexture: NativePtr): Int

@SymbolName("kni_sfml_sfRenderWindow_create")
private external fun kni_sfRenderWindow_create(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_createUnicode")
private external fun kni_sfRenderWindow_createUnicode(mode: NativePtr, title: NativePtr, style: Int, settings: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_createFromHandle")
private external fun kni_sfRenderWindow_createFromHandle(handle: Long, settings: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_destroy")
private external fun kni_sfRenderWindow_destroy(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_close")
private external fun kni_sfRenderWindow_close(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_isOpen")
private external fun kni_sfRenderWindow_isOpen(renderWindow: NativePtr): Int

@SymbolName("kni_sfml_sfRenderWindow_getSettings")
private external fun kni_sfRenderWindow_getSettings(renderWindow: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_pollEvent")
private external fun kni_sfRenderWindow_pollEvent(renderWindow: NativePtr, event: NativePtr): Int

@SymbolName("kni_sfml_sfRenderWindow_waitEvent")
private external fun kni_sfRenderWindow_waitEvent(renderWindow: NativePtr, event: NativePtr): Int

@SymbolName("kni_sfml_sfRenderWindow_getPosition")
private external fun kni_sfRenderWindow_getPosition(renderWindow: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_setPosition")
private external fun kni_sfRenderWindow_setPosition(renderWindow: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_getSize")
private external fun kni_sfRenderWindow_getSize(renderWindow: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_setSize")
private external fun kni_sfRenderWindow_setSize(renderWindow: NativePtr, size: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_setTitle")
private external fun kni_sfRenderWindow_setTitle(renderWindow: NativePtr, title: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_setUnicodeTitle")
private external fun kni_sfRenderWindow_setUnicodeTitle(renderWindow: NativePtr, title: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_setIcon")
private external fun kni_sfRenderWindow_setIcon(renderWindow: NativePtr, width: Int, height: Int, pixels: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_setVisible")
private external fun kni_sfRenderWindow_setVisible(renderWindow: NativePtr, visible: Int): Unit

@SymbolName("kni_sfml_sfRenderWindow_setMouseCursorVisible")
private external fun kni_sfRenderWindow_setMouseCursorVisible(renderWindow: NativePtr, show: Int): Unit

@SymbolName("kni_sfml_sfRenderWindow_setVerticalSyncEnabled")
private external fun kni_sfRenderWindow_setVerticalSyncEnabled(renderWindow: NativePtr, enabled: Int): Unit

@SymbolName("kni_sfml_sfRenderWindow_setKeyRepeatEnabled")
private external fun kni_sfRenderWindow_setKeyRepeatEnabled(renderWindow: NativePtr, enabled: Int): Unit

@SymbolName("kni_sfml_sfRenderWindow_setActive")
private external fun kni_sfRenderWindow_setActive(renderWindow: NativePtr, active: Int): Int

@SymbolName("kni_sfml_sfRenderWindow_requestFocus")
private external fun kni_sfRenderWindow_requestFocus(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_hasFocus")
private external fun kni_sfRenderWindow_hasFocus(renderWindow: NativePtr): Int

@SymbolName("kni_sfml_sfRenderWindow_display")
private external fun kni_sfRenderWindow_display(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_setFramerateLimit")
private external fun kni_sfRenderWindow_setFramerateLimit(renderWindow: NativePtr, limit: Int): Unit

@SymbolName("kni_sfml_sfRenderWindow_setJoystickThreshold")
private external fun kni_sfRenderWindow_setJoystickThreshold(renderWindow: NativePtr, threshold: Float): Unit

@SymbolName("kni_sfml_sfRenderWindow_getSystemHandle")
private external fun kni_sfRenderWindow_getSystemHandle(renderWindow: NativePtr): Long

@SymbolName("kni_sfml_sfRenderWindow_clear")
private external fun kni_sfRenderWindow_clear(renderWindow: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_setView")
private external fun kni_sfRenderWindow_setView(renderWindow: NativePtr, view: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_getView")
private external fun kni_sfRenderWindow_getView(renderWindow: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_getDefaultView")
private external fun kni_sfRenderWindow_getDefaultView(renderWindow: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_getViewport")
private external fun kni_sfRenderWindow_getViewport(renderWindow: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_mapPixelToCoords")
private external fun kni_sfRenderWindow_mapPixelToCoords(renderWindow: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_mapCoordsToPixel")
private external fun kni_sfRenderWindow_mapCoordsToPixel(renderWindow: NativePtr, point: NativePtr, view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfRenderWindow_drawSprite")
private external fun kni_sfRenderWindow_drawSprite(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawText")
private external fun kni_sfRenderWindow_drawText(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawShape")
private external fun kni_sfRenderWindow_drawShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawCircleShape")
private external fun kni_sfRenderWindow_drawCircleShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawConvexShape")
private external fun kni_sfRenderWindow_drawConvexShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawRectangleShape")
private external fun kni_sfRenderWindow_drawRectangleShape(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawVertexArray")
private external fun kni_sfRenderWindow_drawVertexArray(renderWindow: NativePtr, `object`: NativePtr, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_drawPrimitives")
private external fun kni_sfRenderWindow_drawPrimitives(renderWindow: NativePtr, vertices: NativePtr, vertexCount: Long, type: Int, states: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_pushGLStates")
private external fun kni_sfRenderWindow_pushGLStates(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_popGLStates")
private external fun kni_sfRenderWindow_popGLStates(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_resetGLStates")
private external fun kni_sfRenderWindow_resetGLStates(renderWindow: NativePtr): Unit

@SymbolName("kni_sfml_sfRenderWindow_capture")
private external fun kni_sfRenderWindow_capture(renderWindow: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMouse_getPositionRenderWindow")
private external fun kni_sfMouse_getPositionRenderWindow(relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfMouse_setPositionRenderWindow")
private external fun kni_sfMouse_setPositionRenderWindow(position: NativePtr, relativeTo: NativePtr): Unit

@SymbolName("kni_sfml_sfTouch_getPositionRenderWindow")
private external fun kni_sfTouch_getPositionRenderWindow(finger: Int, relativeTo: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShader_createFromFile")
private external fun kni_sfShader_createFromFile(vertexShaderFilename: NativePtr, fragmentShaderFilename: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShader_createFromMemory")
private external fun kni_sfShader_createFromMemory(vertexShader: NativePtr, fragmentShader: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShader_createFromStream")
private external fun kni_sfShader_createFromStream(vertexShaderStream: NativePtr, fragmentShaderStream: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShader_destroy")
private external fun kni_sfShader_destroy(shader: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_setFloatParameter")
private external fun kni_sfShader_setFloatParameter(shader: NativePtr, name: NativePtr, x: Float): Unit

@SymbolName("kni_sfml_sfShader_setFloat2Parameter")
private external fun kni_sfShader_setFloat2Parameter(shader: NativePtr, name: NativePtr, x: Float, y: Float): Unit

@SymbolName("kni_sfml_sfShader_setFloat3Parameter")
private external fun kni_sfShader_setFloat3Parameter(shader: NativePtr, name: NativePtr, x: Float, y: Float, z: Float): Unit

@SymbolName("kni_sfml_sfShader_setFloat4Parameter")
private external fun kni_sfShader_setFloat4Parameter(shader: NativePtr, name: NativePtr, x: Float, y: Float, z: Float, w: Float): Unit

@SymbolName("kni_sfml_sfShader_setVector2Parameter")
private external fun kni_sfShader_setVector2Parameter(shader: NativePtr, name: NativePtr, vector: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_setVector3Parameter")
private external fun kni_sfShader_setVector3Parameter(shader: NativePtr, name: NativePtr, vector: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_setColorParameter")
private external fun kni_sfShader_setColorParameter(shader: NativePtr, name: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_setTransformParameter")
private external fun kni_sfShader_setTransformParameter(shader: NativePtr, name: NativePtr, transform: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_setTextureParameter")
private external fun kni_sfShader_setTextureParameter(shader: NativePtr, name: NativePtr, texture: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_setCurrentTextureParameter")
private external fun kni_sfShader_setCurrentTextureParameter(shader: NativePtr, name: NativePtr): Unit

@SymbolName("kni_sfml_sfShader_getNativeHandle")
private external fun kni_sfShader_getNativeHandle(shader: NativePtr): Int

@SymbolName("kni_sfml_sfShader_bind")
private external fun kni_sfShader_bind(shader: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_destroy")
private external fun kni_sfShape_destroy(shape: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_setPosition")
private external fun kni_sfShape_setPosition(shape: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_setRotation")
private external fun kni_sfShape_setRotation(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfShape_setScale")
private external fun kni_sfShape_setScale(shape: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_setOrigin")
private external fun kni_sfShape_setOrigin(shape: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_getPosition")
private external fun kni_sfShape_getPosition(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getRotation")
private external fun kni_sfShape_getRotation(shape: NativePtr): Float

@SymbolName("kni_sfml_sfShape_getScale")
private external fun kni_sfShape_getScale(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getOrigin")
private external fun kni_sfShape_getOrigin(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_move")
private external fun kni_sfShape_move(shape: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_rotate")
private external fun kni_sfShape_rotate(shape: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfShape_scale")
private external fun kni_sfShape_scale(shape: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_getTransform")
private external fun kni_sfShape_getTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getInverseTransform")
private external fun kni_sfShape_getInverseTransform(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_setTexture")
private external fun kni_sfShape_setTexture(shape: NativePtr, texture: NativePtr, resetRect: Int): Unit

@SymbolName("kni_sfml_sfShape_setTextureRect")
private external fun kni_sfShape_setTextureRect(shape: NativePtr, rect: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_setFillColor")
private external fun kni_sfShape_setFillColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_setOutlineColor")
private external fun kni_sfShape_setOutlineColor(shape: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfShape_setOutlineThickness")
private external fun kni_sfShape_setOutlineThickness(shape: NativePtr, thickness: Float): Unit

@SymbolName("kni_sfml_sfShape_getTexture")
private external fun kni_sfShape_getTexture(shape: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getTextureRect")
private external fun kni_sfShape_getTextureRect(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getFillColor")
private external fun kni_sfShape_getFillColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getOutlineColor")
private external fun kni_sfShape_getOutlineColor(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getOutlineThickness")
private external fun kni_sfShape_getOutlineThickness(shape: NativePtr): Float

@SymbolName("kni_sfml_sfShape_getPointCount")
private external fun kni_sfShape_getPointCount(shape: NativePtr): Long

@SymbolName("kni_sfml_sfShape_getPoint")
private external fun kni_sfShape_getPoint(shape: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getLocalBounds")
private external fun kni_sfShape_getLocalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_getGlobalBounds")
private external fun kni_sfShape_getGlobalBounds(shape: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfShape_update")
private external fun kni_sfShape_update(shape: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_copy")
private external fun kni_sfSprite_copy(sprite: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_destroy")
private external fun kni_sfSprite_destroy(sprite: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_setPosition")
private external fun kni_sfSprite_setPosition(sprite: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_setRotation")
private external fun kni_sfSprite_setRotation(sprite: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfSprite_setScale")
private external fun kni_sfSprite_setScale(sprite: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_setOrigin")
private external fun kni_sfSprite_setOrigin(sprite: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_getPosition")
private external fun kni_sfSprite_getPosition(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getRotation")
private external fun kni_sfSprite_getRotation(sprite: NativePtr): Float

@SymbolName("kni_sfml_sfSprite_getScale")
private external fun kni_sfSprite_getScale(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getOrigin")
private external fun kni_sfSprite_getOrigin(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_move")
private external fun kni_sfSprite_move(sprite: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_rotate")
private external fun kni_sfSprite_rotate(sprite: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfSprite_scale")
private external fun kni_sfSprite_scale(sprite: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_getTransform")
private external fun kni_sfSprite_getTransform(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getInverseTransform")
private external fun kni_sfSprite_getInverseTransform(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_setTexture")
private external fun kni_sfSprite_setTexture(sprite: NativePtr, texture: NativePtr, resetRect: Int): Unit

@SymbolName("kni_sfml_sfSprite_setTextureRect")
private external fun kni_sfSprite_setTextureRect(sprite: NativePtr, rectangle: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_setColor")
private external fun kni_sfSprite_setColor(sprite: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfSprite_getTexture")
private external fun kni_sfSprite_getTexture(sprite: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getTextureRect")
private external fun kni_sfSprite_getTextureRect(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getColor")
private external fun kni_sfSprite_getColor(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getLocalBounds")
private external fun kni_sfSprite_getLocalBounds(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfSprite_getGlobalBounds")
private external fun kni_sfSprite_getGlobalBounds(sprite: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_copy")
private external fun kni_sfText_copy(text: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_destroy")
private external fun kni_sfText_destroy(text: NativePtr): Unit

@SymbolName("kni_sfml_sfText_setPosition")
private external fun kni_sfText_setPosition(text: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfText_setRotation")
private external fun kni_sfText_setRotation(text: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfText_setScale")
private external fun kni_sfText_setScale(text: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfText_setOrigin")
private external fun kni_sfText_setOrigin(text: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfText_getPosition")
private external fun kni_sfText_getPosition(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getRotation")
private external fun kni_sfText_getRotation(text: NativePtr): Float

@SymbolName("kni_sfml_sfText_getScale")
private external fun kni_sfText_getScale(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getOrigin")
private external fun kni_sfText_getOrigin(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_move")
private external fun kni_sfText_move(text: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfText_rotate")
private external fun kni_sfText_rotate(text: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfText_scale")
private external fun kni_sfText_scale(text: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfText_getTransform")
private external fun kni_sfText_getTransform(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getInverseTransform")
private external fun kni_sfText_getInverseTransform(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_setString")
private external fun kni_sfText_setString(text: NativePtr, string: NativePtr): Unit

@SymbolName("kni_sfml_sfText_setUnicodeString")
private external fun kni_sfText_setUnicodeString(text: NativePtr, string: NativePtr): Unit

@SymbolName("kni_sfml_sfText_setFont")
private external fun kni_sfText_setFont(text: NativePtr, font: NativePtr): Unit

@SymbolName("kni_sfml_sfText_setCharacterSize")
private external fun kni_sfText_setCharacterSize(text: NativePtr, size: Int): Unit

@SymbolName("kni_sfml_sfText_setStyle")
private external fun kni_sfText_setStyle(text: NativePtr, style: Int): Unit

@SymbolName("kni_sfml_sfText_setColor")
private external fun kni_sfText_setColor(text: NativePtr, color: NativePtr): Unit

@SymbolName("kni_sfml_sfText_getString")
private external fun kni_sfText_getString(text: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getUnicodeString")
private external fun kni_sfText_getUnicodeString(text: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getFont")
private external fun kni_sfText_getFont(text: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getCharacterSize")
private external fun kni_sfText_getCharacterSize(text: NativePtr): Int

@SymbolName("kni_sfml_sfText_getStyle")
private external fun kni_sfText_getStyle(text: NativePtr): Int

@SymbolName("kni_sfml_sfText_getColor")
private external fun kni_sfText_getColor(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_findCharacterPos")
private external fun kni_sfText_findCharacterPos(text: NativePtr, index: Long, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getLocalBounds")
private external fun kni_sfText_getLocalBounds(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfText_getGlobalBounds")
private external fun kni_sfText_getGlobalBounds(text: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_createFromFile")
private external fun kni_sfTexture_createFromFile(filename: NativePtr, area: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_createFromMemory")
private external fun kni_sfTexture_createFromMemory(data: NativePtr, sizeInBytes: Long, area: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_createFromStream")
private external fun kni_sfTexture_createFromStream(stream: NativePtr, area: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_createFromImage")
private external fun kni_sfTexture_createFromImage(image: NativePtr, area: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_copy")
private external fun kni_sfTexture_copy(texture: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_destroy")
private external fun kni_sfTexture_destroy(texture: NativePtr): Unit

@SymbolName("kni_sfml_sfTexture_getSize")
private external fun kni_sfTexture_getSize(texture: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_copyToImage")
private external fun kni_sfTexture_copyToImage(texture: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTexture_updateFromPixels")
private external fun kni_sfTexture_updateFromPixels(texture: NativePtr, pixels: NativePtr, width: Int, height: Int, x: Int, y: Int): Unit

@SymbolName("kni_sfml_sfTexture_updateFromImage")
private external fun kni_sfTexture_updateFromImage(texture: NativePtr, image: NativePtr, x: Int, y: Int): Unit

@SymbolName("kni_sfml_sfTexture_updateFromWindow")
private external fun kni_sfTexture_updateFromWindow(texture: NativePtr, window: NativePtr, x: Int, y: Int): Unit

@SymbolName("kni_sfml_sfTexture_updateFromRenderWindow")
private external fun kni_sfTexture_updateFromRenderWindow(texture: NativePtr, renderWindow: NativePtr, x: Int, y: Int): Unit

@SymbolName("kni_sfml_sfTexture_setSmooth")
private external fun kni_sfTexture_setSmooth(texture: NativePtr, smooth: Int): Unit

@SymbolName("kni_sfml_sfTexture_isSmooth")
private external fun kni_sfTexture_isSmooth(texture: NativePtr): Int

@SymbolName("kni_sfml_sfTexture_setRepeated")
private external fun kni_sfTexture_setRepeated(texture: NativePtr, repeated: Int): Unit

@SymbolName("kni_sfml_sfTexture_isRepeated")
private external fun kni_sfTexture_isRepeated(texture: NativePtr): Int

@SymbolName("kni_sfml_sfTexture_getNativeHandle")
private external fun kni_sfTexture_getNativeHandle(texture: NativePtr): Int

@SymbolName("kni_sfml_sfTexture_bind")
private external fun kni_sfTexture_bind(texture: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_copy")
private external fun kni_sfTransformable_copy(transformable: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransformable_destroy")
private external fun kni_sfTransformable_destroy(transformable: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_setPosition")
private external fun kni_sfTransformable_setPosition(transformable: NativePtr, position: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_setRotation")
private external fun kni_sfTransformable_setRotation(transformable: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfTransformable_setScale")
private external fun kni_sfTransformable_setScale(transformable: NativePtr, scale: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_setOrigin")
private external fun kni_sfTransformable_setOrigin(transformable: NativePtr, origin: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_getPosition")
private external fun kni_sfTransformable_getPosition(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransformable_getRotation")
private external fun kni_sfTransformable_getRotation(transformable: NativePtr): Float

@SymbolName("kni_sfml_sfTransformable_getScale")
private external fun kni_sfTransformable_getScale(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransformable_getOrigin")
private external fun kni_sfTransformable_getOrigin(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransformable_move")
private external fun kni_sfTransformable_move(transformable: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_rotate")
private external fun kni_sfTransformable_rotate(transformable: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfTransformable_scale")
private external fun kni_sfTransformable_scale(transformable: NativePtr, factors: NativePtr): Unit

@SymbolName("kni_sfml_sfTransformable_getTransform")
private external fun kni_sfTransformable_getTransform(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfTransformable_getInverseTransform")
private external fun kni_sfTransformable_getInverseTransform(transformable: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfVertexArray_copy")
private external fun kni_sfVertexArray_copy(vertexArray: NativePtr): NativePtr

@SymbolName("kni_sfml_sfVertexArray_destroy")
private external fun kni_sfVertexArray_destroy(vertexArray: NativePtr): Unit

@SymbolName("kni_sfml_sfVertexArray_getVertexCount")
private external fun kni_sfVertexArray_getVertexCount(vertexArray: NativePtr): Long

@SymbolName("kni_sfml_sfVertexArray_getVertex")
private external fun kni_sfVertexArray_getVertex(vertexArray: NativePtr, index: Long): NativePtr

@SymbolName("kni_sfml_sfVertexArray_clear")
private external fun kni_sfVertexArray_clear(vertexArray: NativePtr): Unit

@SymbolName("kni_sfml_sfVertexArray_resize")
private external fun kni_sfVertexArray_resize(vertexArray: NativePtr, vertexCount: Long): Unit

@SymbolName("kni_sfml_sfVertexArray_append")
private external fun kni_sfVertexArray_append(vertexArray: NativePtr, vertex: NativePtr): Unit

@SymbolName("kni_sfml_sfVertexArray_setPrimitiveType")
private external fun kni_sfVertexArray_setPrimitiveType(vertexArray: NativePtr, type: Int): Unit

@SymbolName("kni_sfml_sfVertexArray_getPrimitiveType")
private external fun kni_sfVertexArray_getPrimitiveType(vertexArray: NativePtr): Int

@SymbolName("kni_sfml_sfVertexArray_getBounds")
private external fun kni_sfVertexArray_getBounds(vertexArray: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfView_createFromRect")
private external fun kni_sfView_createFromRect(rectangle: NativePtr): NativePtr

@SymbolName("kni_sfml_sfView_copy")
private external fun kni_sfView_copy(view: NativePtr): NativePtr

@SymbolName("kni_sfml_sfView_destroy")
private external fun kni_sfView_destroy(view: NativePtr): Unit

@SymbolName("kni_sfml_sfView_setCenter")
private external fun kni_sfView_setCenter(view: NativePtr, center: NativePtr): Unit

@SymbolName("kni_sfml_sfView_setSize")
private external fun kni_sfView_setSize(view: NativePtr, size: NativePtr): Unit

@SymbolName("kni_sfml_sfView_setRotation")
private external fun kni_sfView_setRotation(view: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfView_setViewport")
private external fun kni_sfView_setViewport(view: NativePtr, viewport: NativePtr): Unit

@SymbolName("kni_sfml_sfView_reset")
private external fun kni_sfView_reset(view: NativePtr, rectangle: NativePtr): Unit

@SymbolName("kni_sfml_sfView_getCenter")
private external fun kni_sfView_getCenter(view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfView_getSize")
private external fun kni_sfView_getSize(view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfView_getRotation")
private external fun kni_sfView_getRotation(view: NativePtr): Float

@SymbolName("kni_sfml_sfView_getViewport")
private external fun kni_sfView_getViewport(view: NativePtr, retValPlacement: NativePtr): NativePtr

@SymbolName("kni_sfml_sfView_move")
private external fun kni_sfView_move(view: NativePtr, offset: NativePtr): Unit

@SymbolName("kni_sfml_sfView_rotate")
private external fun kni_sfView_rotate(view: NativePtr, angle: Float): Unit

@SymbolName("kni_sfml_sfView_zoom")
private external fun kni_sfView_zoom(view: NativePtr, factor: Float): Unit
