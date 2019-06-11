package restart;

public class GenEntry <K, V> 
{
	private K key;
	private V value;
	
	public GenEntry(K iKey, V iVal)
	{
		this.key = iKey;
		this.value = iVal;
	}
	
	public K getKey()
	{
		return key;
	}
	
	public V getValue()
	{
		return value;
	}

}
