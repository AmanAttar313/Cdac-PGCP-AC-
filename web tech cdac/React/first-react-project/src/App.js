// import logo from './logo.svg';
import './App.css';

import FunCompo from './component/FunctionCompo.js';
import ClassCompo from './component/ClassCompo.js';
import MyDetailsCompo from './task_OR_assigments/MydetaiilsCompo.js';
import MyfrindDetails from './task_OR_assigments/MyfrindDetails.js';
import Greeting from './component/Greeting.js';
import StateCompo from './component/StateCompo.js';
import CountCompo from './task_OR_assigments/CountCompo.js';
import ParentCompo from './component/ParentCompo.js';
import ConditionalRenCompo from './component/ConditionalRenCompo.js';
import { ImageCompo } from './component/ImageCompo.js';
import MyListCompo from './component/MyListCompo.js';
import MyCrouselCompo from './component/MyCrouselCompo.js';
import UserCompo from './component/UserCompo.js';
import ErrorBoundryCompo from './component/ErrorBoundryCompo.js';
import UseStateHookCompo from './component/Hooks/UseStateHookCompo.js';
import UseEffectHooksCompo from './component/Hooks/UseEffectHooksCompo.js';
import MyFormCompo from './component/MyFormCompo.js';


function App() {
  return (
    <div className="App">

      {/* <h1>AMAN FIRST REACT PROJECT</h1>
      <FunCompo fname="AMAN" lname="ATTAR" pin={102} />
      <ClassCompo fname="AMAN" lname="ATTAR" pin={102} /> */}

      {/* <MyDetailsCompo name="AMAN" contact={9922637135} Gender="male" Address="Pune"/>
      <MyfrindDetails name="DON" Contact={9284627491} Gender="male" Address="SATARA"/>
      <Greeting/> */}
      {/* <StateCompo/>
      <CountCompo/> */}

      {/* <ParentCompo/> */}
      {/* <ConditionalRenCompo/> */}
      {/* <ImageCompo/>
           <MyListCompo/> */}

      {/* <MyCrouselCompo/> */}

      {/* <ErrorBoundryCompo>
        <UserCompo userName="Aman" />
      </ErrorBoundryCompo>

      <ErrorBoundryCompo>
        <UserCompo userName="ajinkya" />
      </ErrorBoundryCompo>

      <ErrorBoundryCompo>
        <UserCompo userName="Aqsa" />
      </ErrorBoundryCompo>

      <ErrorBoundryCompo>
        <UserCompo userName="Paryy_Khomane" />
      </ErrorBoundryCompo> */}


        {/* <UseStateHookCompo/> */}

        <UseEffectHooksCompo/>
        {/* <MyFormCompo/> */}






    </div>
  );
}

export default App;
