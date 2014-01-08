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
        [Test]
        public void Converts11ToXI()
        {
            Assert.AreEqual("XI", new Roman.Numeral().Convert(11));
        }
        [Test]
        public void Converts40ToXL()
        {
            Assert.AreEqual("XL", new Roman.Numeral().Convert(40));
        }
        [Test]
        public void Converts50ToL()
        {
            Assert.AreEqual("L", new Roman.Numeral().Convert(50));
        }
        [Test]
        public void Converts90ToXC()
        {
            Assert.AreEqual("XC", new Roman.Numeral().Convert(90));
        }
        [Test]
        public void Converts100ToC()
        {
            Assert.AreEqual("C", new Roman.Numeral().Convert(100));
        }
        [Test]
        public void Converts400ToCD()
        {
            Assert.AreEqual("CD", new Roman.Numeral().Convert(400));
        }
        [Test]
        public void Converts500ToC()
        {
            Assert.AreEqual("D", new Roman.Numeral().Convert(500));
        }
        [Test]
        public void Converts900ToCM()
        {
            Assert.AreEqual("CM", new Roman.Numeral().Convert(900));
        }
        [Test]
        public void Converts1000ToC()
        {
            Assert.AreEqual("M", new Roman.Numeral().Convert(1000));
        }
        [Test]
        public void Converts2999ToMMCMXCIX()
        {
            Assert.AreEqual("MMCMXCIX", new Roman.Numeral().Convert(2999));
        }

    }
}
