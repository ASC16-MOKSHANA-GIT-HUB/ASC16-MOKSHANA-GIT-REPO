def print_digits_in_words(number):
    words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for digit in str(number):
        print(words[int(digit)], end=" ")
#ex
num = int(input("Enter a three-digit number: "))
print_digits_in_words(num)