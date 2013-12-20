using Roman;
using NUnit.Framework;

namespace Roman
{
    [TestFixture]
    public class NumeralTests
    {
        [Test]
        public void Converts1ToI()
        {
            Assert.AreEqual("I", new Roman.Numeral().Convert(1));
        }
        [Test]
        public void Converts2ToII()
        {
            Assert.AreEqual("II", new Roman.Numeral().Convert(2));
        }
        [Test]
        public void Converts3ToIII()
        {
            Assert.AreEqual("III", new Roman.Numeral().Convert(3));
        }
        [Test]
        public void Converts4ToIV()
        {
            Assert.AreEqual("IV", new Roman.Numeral().Convert(4));
        }
        [Test]
        public void Converts5ToV()
        {
            Assert.AreEqual("V", new Roman.Numeral().Convert(5));
        }
        [Test]
        public void Converts6ToVI()
        {
            Assert.AreEqual("VI", new Roman.Numeral().Convert(6));
        }
        [Test]
        public void Converts9ToIX()
        {
            Assert.AreEqual("IX", new Roman.Numeral().Convert(9));
        }
        [Test]
        public void Converts10ToX()
        {
            Assert.AreEqual("X", new Roman.Numeral().Convert(10));
        }
    }
}
