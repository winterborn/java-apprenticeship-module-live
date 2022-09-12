def longest_name(names)
  longest = ""
  names.each { |name| longest = name if longest.length < name }
  longest
end

people = %w[Adam Clara George Jane]

puts longest_name(people)

# Fails due to comparison of integer and string.
