import React, { Component } from 'react';
import DemoApp from './components/demo/DemoApp'
import './App.css';
import './bootstrap.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <DemoApp />
      </div>
    );
  }
}

export default App;