class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        words = dict()
        s_words = s1.split(" ")
        s_words += s2.split(" ")
        for word in s_words:
            if word in words:
                words[word] += 1
            else:
                words[word] = 1
        res = []
        print(words)
        for (key, value) in words.items():
            if value == 1:
                res.append(key)
        return res
