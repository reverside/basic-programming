using System;
using Xunit;

namespace Reverside.Training.BP.P01
{
    public class ProgramTest
    {
        [Fact]
        public void Test1()
        {
            Program program = new Program();
            int result = program.Add(2, 3);
            Assert.Equal(5, result);
        }
    }
}
