import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

export default function (elementId, props) {
  ReactDOM.render(<App {...props} />, document.getElementById(elementId));
};
