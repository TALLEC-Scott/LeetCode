class Solution:
    def minOperations(self, logs: List[str]) -> int:
        depth = 0
        for operation in logs:
            if operation == "../":
                # depth = 0 if depth == 0 else depth - 1  ternary operator
                # depth = max(0, depth - 1)
                if depth != 0:
                    depth -= 1
            elif operation != "./":
                depth += 1
            
        return depth
