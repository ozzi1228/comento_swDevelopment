import { useState } from "react";

export default function App() {
  const [name, setName] = useState("");

  return (
    <div>
      <h1>이름 입력</h1>
      <input
        value={name}
        onChange={(e) => setName(e.target.value)}
        placeholder="이름을 입력하세요"
      />
      <p>안녕하세요, {name}</p>
    </div>
  );
}
