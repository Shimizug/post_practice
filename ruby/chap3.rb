# (1..100000).each do |x| 
#   y = "#{x}SHEEP"*x
#   puts y.slice(33333,20)
# end
(1..2).each do |x|
  (1..2).each do |y|
    @z = "#{y}SHEEP"*x
    p z
  end
end
  
puts @z


