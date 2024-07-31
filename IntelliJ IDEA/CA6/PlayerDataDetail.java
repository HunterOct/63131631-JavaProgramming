package CA6;

public interface PlayerDataDetail {
     void listen(PlayerData){
         def input_set():
         n = int(input())
         set_elements = list(map(int, input().split()))
         return set(set_elements)

# Nhập tập hợp A
         print("Nhập tập hợp A:")
         A = input_set()

# Nhập tập hợp B
         print("Nhập tập hợp B:")
         B = input_set()

# Tính giao của hai tập hợp
         intersection = sorted(list(A & B))
         if not intersection:
         print("none")
else:
         print(*intersection)

# Tính hợp của hai tập hợp
         union = sorted(list(A | B))
         print(*union)
    }
}
