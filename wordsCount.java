public int wordsCount(String[] words, int len) {
  int sum = 0;
  for(int i=0;i<words.length;i++)
  {
    if(words[i].length()==len)
    {
      sum += 1;
    }
  }
  return sum;
}
