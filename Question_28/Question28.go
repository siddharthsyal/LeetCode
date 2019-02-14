package main

import (
	"bufio"
	"fmt"
	"os"
)

func errHandle(err error){
	fmt.Println(err)
	os.Exit(1)
}

func ifPresent(haystack, needle string, pos int)int{
	j :=0
	for i:=pos;i<pos+len(needle)&&j<len(needle);i++{
		if byte(haystack[i])!=byte(needle[j]){
			return -1
		}
		j++
	}
	return pos
}

func strStr(haystack, needle string)int{
	if len(needle)>len(haystack)||len(needle)==0||len(haystack)==0{
		return -1
	}
	if needle == " "{
		return 0
	}
	for i:=0;i<len(haystack);i++{
		if byte(haystack[i])==byte(needle[0]){
			if ifPresent(haystack,needle,i)!= -1{
				return i
			}
		}
	}
	return -1
}

func readInput()(string,string){
	var haystack, needle string
	fmt.Println("Enter haystack : ")
	input := bufio.NewReader(os.Stdin)
	user_input, err := input.ReadString('\n')
	if err !=nil{
		fmt.Println("Input Error")
		errHandle(err)
	}
	haystack = string([]byte(user_input[:len(user_input)-1]))
	fmt.Println("Enter the Needle : ")
	user_input, err = input.ReadString('\n')
	if err !=nil{
		fmt.Println("Input Error")
		errHandle(err)
	}
	needle = string([]byte(user_input[:len(user_input)-1]))
	fmt.Println("Haystack = ", haystack, "\nNeedle ",needle)
	return haystack,needle
}

func main(){
	haystack,needle := readInput()
	fmt.Println(strStr(haystack,needle))
}