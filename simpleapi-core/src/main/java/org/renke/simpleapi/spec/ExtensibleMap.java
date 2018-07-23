package org.renke.simpleapi.spec;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public abstract class ExtensibleMap<K, V> extends Extensible implements Map<K, V> {
  private final Map<K, V> delegate = new HashMap<>();

  @Override
  public int size() {
    return delegate.size();
  }

  @Override
  public boolean isEmpty() {
    return delegate.isEmpty();
  }

  @Override
  public boolean containsKey(Object key) {
    return delegate.containsKey(key);
  }

  @Override
  public boolean containsValue(Object value) {
    return delegate.containsValue(value);
  }

  @Override
  public V get(Object key) {
    return delegate.get(key);
  }

  @Override
  public V put(K key, V value) {
    return delegate.put(key, value);
  }

  @Override
  public V remove(Object key) {
    return delegate.remove(key);
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {
    delegate.putAll(m);
  }

  @Override
  public void clear() {
    delegate.clear();
  }

  @Override
  public Set<K> keySet() {
    return delegate.keySet();
  }

  @Override
  public Collection<V> values() {
    return delegate.values();
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    return delegate.entrySet();
  }

  @Override
  public String toString() {
    return delegate.toString();
  }

  public static class ExtensibleMapBuilder<T extends ExtensibleMap<K, V>, K, V> {
    private final T building;

    public ExtensibleMapBuilder(Supplier<T> mapSupplier) {
      this.building = mapSupplier.get();
    }

    public ExtensibleMapBuilder<T, K, V> add(K key, V value) {
      building.put(key, value);
      return this;
    }

    public T build() {
      return building;
    }
  }
}
