package kotlinx.sharing

public annotation class Shared

public annotation class SharedImmutable

@Target(AnnotationTarget.CLASS, AnnotationTarget.TYPE, AnnotationTarget.TYPE_PARAMETER)
public annotation class Owned

public annotation class IgnoreOwned
