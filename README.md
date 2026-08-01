| 日期 | JavaSE课程 | 刷题 | 八股 |
| --- | --- | --- | --- |
| 7/31 | javase-day07 | 3道 |  |
| 8/1 | javase-day08-120 | 7道 |  |
---

# Java 集合框架常用方法速查表
## 一、List（`ArrayList` / `LinkedList`）

| 方法 | 说明 | 示例 |
| :--- | :--- | :--- |
| `add(E e)` | 在末尾添加元素 | `list.add("apple")` |
| `add(int index, E e)` | 在指定位置插入 | `list.add(1, "banana")` |
| `get(int index)` | 获取指定索引元素 | `list.get(0)` |
| `set(int index, E e)` | 替换指定索引元素 | `list.set(0, "pear")` |
| `remove(int index)` | 删除指定索引元素 | `list.remove(1)` |
| `remove(Object o)` | 删除第一个匹配的元素 | `list.remove("apple")` |
| `size()` | 返回元素个数 | `list.size()` |
| `isEmpty()` | 是否为空 | `list.isEmpty()` |
| `contains(Object o)` | 是否包含某元素 | `list.contains("apple")` |
| `indexOf(Object o)` | 返回元素首次出现的索引 | `list.indexOf("apple")` |
| `lastIndexOf(Object o)` | 返回元素最后出现的索引 | `list.lastIndexOf("apple")` |
| `toArray()` | 转为数组 | `list.toArray()` |
| `sort(Comparator c)` | 排序（Java 8+） | `list.sort((a,b) -> a-b)` |

---

## 二、Set（`HashSet` / `LinkedHashSet` / `TreeSet`）

| 方法 | 说明 | 示例 |
| :--- | :--- | :--- |
| `add(E e)` | 添加元素，已存在返回 `false` | `set.add("apple")` |
| `remove(Object o)` | 删除元素，存在返回 `true` | `set.remove("apple")` |
| `contains(Object o)` | 是否包含某元素 | `set.contains("apple")` |
| `size()` | 返回元素个数 | `set.size()` |
| `isEmpty()` | 是否为空 | `set.isEmpty()` |
| `clear()` | 清空所有元素 | `set.clear()` |
| `addAll(Collection c)` | 并集（添加另一个集合所有元素） | `set.addAll(list)` |
| `retainAll(Collection c)` | 交集（保留与另一个集合的交集） | `set.retainAll(list)` |
| `removeAll(Collection c)` | 差集（删除与另一个集合的交集） | `set.removeAll(list)` |
| `containsAll(Collection c)` | 是否包含另一个集合的全部元素 | `set.containsAll(list)` |
| `iterator()` | 返回迭代器 | `set.iterator()` |

---

## 三、Map（`HashMap` / `LinkedHashMap` / `TreeMap`）

| 方法 | 说明 | 示例 |
| :--- | :--- | :--- |
| `put(K key, V value)` | 插入键值对，返回旧值 | `map.put("a", 1)` |
| `putIfAbsent(K key, V value)` | 仅当键不存在时插入 | `map.putIfAbsent("a", 2)` |
| `get(Object key)` | 获取值，不存在返回 `null` | `map.get("a")` |
| `getOrDefault(Object key, V defaultValue)` | 获取值，不存在返回默认值 | `map.getOrDefault("b", 0)` |
| `containsKey(Object key)` | 是否包含某键 | `map.containsKey("a")` |
| `containsValue(Object value)` | 是否包含某值 | `map.containsValue(1)` |
| `remove(Object key)` | 删除键值对，返回被删除的值 | `map.remove("a")` |
| `remove(Object key, Object value)` | 仅当键值都匹配时删除 | `map.remove("a", 1)` |
| `size()` | 返回键值对数量 | `map.size()` |
| `isEmpty()` | 是否为空 | `map.isEmpty()` |
| `clear()` | 清空所有键值对 | `map.clear()` |
| `keySet()` | 返回所有键的 `Set` | `map.keySet()` |
| `values()` | 返回所有值的 `Collection` | `map.values()` |
| `entrySet()` | 返回所有键值对的 `Set` | `map.entrySet()` |
| `forEach(BiConsumer action)` | Lambda 遍历（Java 8+） | `map.forEach((k,v) -> ...)` |
| `computeIfAbsent(K key, Function mappingFunction)` | 键不存在时计算新值 | `map.computeIfAbsent("b", k -> 0)` |
| `replace(K key, V value)` | 仅当键存在时替换值 | `map.replace("a", 100)` |

---

## 四、Stack（`Stack` / `ArrayDeque` 推荐）

| 方法 | 说明 | 示例 |
| :--- | :--- | :--- |
| `push(E e)` | 入栈（压入栈顶） | `stack.push(1)` |
| `pop()` | 出栈（移除并返回栈顶元素） | `stack.pop()` |
| `peek()` | 查看栈顶元素（不移除） | `stack.peek()` |
| `empty()` / `isEmpty()` | 是否为空 | `stack.empty()` |
| `search(Object o)` | 查找元素位置（从栈顶计数，1 开始） | `stack.search(1)` |

> ⚠️ `Stack` 是遗留类，推荐使用 `Deque<Integer> stack = new ArrayDeque<>();`

---

## 五、Queue（`Queue` 接口，常用 `LinkedList` / `ArrayDeque`）

| 操作 | 抛出异常版本 | 返回特殊值版本 | 说明 |
| :--- | :--- | :--- | :--- |
| **入队** | `add(E e)` | `offer(E e)` | 添加元素到队尾 |
| **出队** | `remove()` | `poll()` | 移除并返回队首元素 |
| **查看队首** | `element()` | `peek()` | 查看队首元素（不移除） |
| `size()` | 返回元素个数 | `queue.size()` |
| `isEmpty()` | 是否为空 | `queue.isEmpty()` |

---

## 六、Deque（双端队列，推荐替代 `Stack` 和 `Queue`）

| 方法 | 说明 | 示例 |
| :--- | :--- | :--- |
| `push(E e)` | 在队列**头部**插入（当栈用） | `deque.push(1)` |
| `pop()` | 移除并返回**头部**元素（当栈用） | `deque.pop()` |
| `peek()` | 查看**头部**元素（不移除） | `deque.peek()` |
| `offerFirst(E e)` | 在**头部**插入 | `deque.offerFirst(1)` |
| `offerLast(E e)` | 在**尾部**插入 | `deque.offerLast(2)` |
| `pollFirst()` | 移除并返回**头部**元素 | `deque.pollFirst()` |
| `pollLast()` | 移除并返回**尾部**元素 | `deque.pollLast()` |
| `peekFirst()` | 查看**头部**元素 | `deque.peekFirst()` |
| `peekLast()` | 查看**尾部**元素 | `deque.peekLast()` |

---

## 七、PriorityQueue（优先队列 / 堆）

| 方法 | 说明 | 示例 |
| :--- | :--- | :--- |
| `offer(E e)` | 插入元素 | `pq.offer(5)` |
| `poll()` | 移除并返回队首（最小/最大）元素 | `pq.poll()` |
| `peek()` | 查看队首元素（不移除） | `pq.peek()` |
| `size()` | 返回元素个数 | `pq.size()` |
| `isEmpty()` | 是否为空 | `pq.isEmpty()` |

---

## 八、各集合底层结构对比

| 接口/类 | 底层结构 | 有序性 | 是否允许重复 | 是否允许 `null` |
| :--- | :--- | :--- | :--- | :--- |
| **ArrayList** | 动态数组 | ✅ 有序（按索引） | ✅ 允许 | ✅ 允许 |
| **LinkedList** | 双向链表 | ✅ 有序（按索引） | ✅ 允许 | ✅ 允许 |
| **HashSet** | 哈希表（`HashMap`） | ❌ 无序 | ❌ 不允许 | ✅ 允许 |
| **LinkedHashSet** | 哈希表 + 链表 | ✅ 插入顺序 | ❌ 不允许 | ✅ 允许 |
| **TreeSet** | 红黑树（`TreeMap`） | ✅ 自然排序 | ❌ 不允许 | ❌ 不允许（依赖比较器） |
| **HashMap** | 数组 + 链表 + 红黑树 | ❌ 无序 | 键唯一，值可重复 | ✅ 允许一个 `null` 键 |
| **LinkedHashMap** | 哈希表 + 链表 | ✅ 插入顺序 | 键唯一，值可重复 | ✅ 允许一个 `null` 键 |
| **TreeMap** | 红黑树 | ✅ 自然排序 | 键唯一，值可重复 | ❌ 不允许 `null` 键 |
| **Stack** | 数组（Vector） | ✅ LIFO | ✅ 允许 | ✅ 允许 |
| **ArrayDeque** | 动态数组（循环数组） | ✅ 两端操作 | ✅ 允许 | ❌ 不允许 `null` |
| **PriorityQueue** | 数组（堆） | ✅ 按优先级出队 | ✅ 允许 | ❌ 不允许 `null` |

---

## 九、集合遍历方式汇总

| 集合类型 | 推荐遍历方式 |
| :--- | :--- |
| **List** | `for (E e : list)` 或 `for (int i = 0; i < list.size(); i++)` |
| **Set** | `for (E e : set)` |
| **Map** | `for (Map.Entry<K,V> e : map.entrySet())` |
| **Stack** | `while (!stack.empty()) { stack.pop(); }` |
| **Queue** | `while (!queue.isEmpty()) { queue.poll(); }` |
| **PriorityQueue** | `while (!pq.isEmpty()) { pq.poll(); }` |

---

## 十、高频刷题组合

| 场景 | 推荐组合 |
| :--- | :--- |
| 去重 / 判重 | `HashSet` |
| 键值存储 / 计数 | `HashMap` |
| 存储有序列表 | `ArrayList` |
| 栈（后进先出） | `ArrayDeque`（`push`/`pop`/`peek`） |
| 队列（先进先出） | `ArrayDeque`（`offer`/`poll`/`peek`） |
| 优先队列（堆） | `PriorityQueue` |
| 需要排序的 Set | `TreeSet` |
| 需要排序的 Map | `TreeMap` |
| 保留插入顺序的 Map | `LinkedHashMap` |
