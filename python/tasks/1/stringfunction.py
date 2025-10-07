# 1. Indexing
print("1. Indexing:", text[2])        # → 'H' (character at index 2)

# 2. Membership test
print("2. Membership test:", "Python" in text)   # → True

# 3. len(text)
print("3. Length of text:", len(text))           # → 21 (includes spaces)

# 4. find()
print("4. Find position of 'Python':", text.find("Python"))  # → 8

# 5. Equality (==)
print("5. Equality:", text.strip() == "Hello Python World")  # → True

# 6. Case-insensitive equality
print("6. Case-insensitive equality:",
      text.strip().lower() == "hello python world".lower())  # → True

# 7. join()
words = ["Python", "is", "fun"]
print("7. Join:", " ".join(words))             # → 'Python is fun'

# 8. rfind()
print("8. rfind() position of 'o':", text.rfind("o"))        # → 17 (last occurrence)

# 9. Slicing
print("9. Slicing (2:7):", text[2:7])          # → 'Hello'

# 10. lower()
print("10. lower():", text.lower())            # → '  hello python world  '

# 11. upper()
print("11. upper():", text.upper())            # → '  HELLO PYTHON WORLD  '

# 12. strip()
print("12. strip():", text.strip())     