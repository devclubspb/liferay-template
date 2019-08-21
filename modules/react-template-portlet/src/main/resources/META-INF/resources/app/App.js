import React, { memo } from 'react';

function App(props) {
  console.debug({ ...props });
  return (
    <div>
      <h1>React Template Portlet</h1>
      <p>props:</p>
      <ul>
        {Object.entries(props).map(([key, value], index) => (
          <li key={index}>
            <b>{key}</b>=<span>{value}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default memo(App);
