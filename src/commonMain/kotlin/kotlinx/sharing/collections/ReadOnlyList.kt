package kotlinx.sharing.collections

public class ReadOnlyList<T>(private val original: List<T>): AbstractMutableList<T>() {
    override val size: Int = original.size

    override fun get(index: Int): T = original[index]

    override fun add(index: Int, element: T): Unit = err()

    override fun removeAt(index: Int): T = err()

    override fun set(index: Int, element: T): T = err()

    private fun err(): Nothing = error("This implementation is in read-only state")
}
