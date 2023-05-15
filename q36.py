class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # check rows
        for r in range(0, len(board)):
            if not self.isUnique(board[r]):
                return False
                
        # check cols, transpose columns
        col_matrix = list(zip(*board))
        for c in range(0, len(col_matrix)):
            if not self.isUnique(col_matrix[c]):
                return False
        
        # check 3x3 matrices
        for i in (0,3,6):
            for j in (0,3,6):
                square = [board[x][y] for x in range(i, i + 3) for y in range(j, j + 3)]
                if not self.isUnique(square):
                    return False
        return True
        
    def isUnique(self, lists: List[str]) -> bool:
        num_l = []
        for l in lists:
            if (l != "."):
                num_l.append(l)
        # print(num_l)
        return len(set(num_l)) == len(num_l)

        
