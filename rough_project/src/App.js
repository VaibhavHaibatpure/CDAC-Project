import logo from './logo.svg';
import './App.css';

import Navbar from './components/Navbar';
import MainContent from './components/MainContent';
import Footer from './components/Footer';
import StaffDetails from './components/StaffDetails';

function App() {
  return (
   <>
    <Navbar></Navbar>
   <MainContent/>
   <StaffDetails></StaffDetails>
   <Footer/>
   </>
  );
}

export default App;
