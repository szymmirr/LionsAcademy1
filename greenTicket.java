public int greenTicket(int a, int b, int c) {
  if(a!=b&&a!=c&&b!=c)
  {
    return 0;
  }
  if(a==b&&b==c)
  {
    return 20;
  }
  else
  {
    return 10;
  }
}
