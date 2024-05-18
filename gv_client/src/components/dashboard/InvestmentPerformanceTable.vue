<template>
    <q-table :rows="investors" :columns="columns" />
  </template>
  
  <script lang="ts" setup>
  import { QTableColumn } from 'quasar';
  import { ref, onMounted } from 'vue';
  import axios from 'axios';
  
  interface Investor {
    id: number;
    name: string;
    cashDistributions: number;
    taxCredits: number;
    powerProduced: number;
    carbonAvoided: number;
  }
  
  // You will get auto-complete on properties like `align`('left', 'right', etc.), `field`('id', 'name' and 'address' because of User), etc.
  const columns: QTableColumn<Investor>[] = [
    { name: 'name', align: 'left', label: 'Fund Name', field: 'name' },
    {
      name: 'cash distributions',
      align: 'left',
      label: 'CASH DISTRIBUTIONS',
      // row is type of User, we get IntelliSense, etc.
      field: (row) => row.cashDistributions,
    },
    {
      name: 'tax credits',
      align: 'left',
      label: 'TAX CREDITS',
      // row is type of User, we get IntelliSense, etc.
      field: (row) => row.taxCredits,
    },
    {
      name: 'power produced',
      align: 'left',
      label: 'POWER PRODUCED',
      // row is type of User, we get IntelliSense, etc.
      field: (row) => row.powerProduced,
    },
    {
      name: 'carbon avoided',
      align: 'left',
      label: 'C02E AVOIDED',
      // row is type of User, we get IntelliSense, etc.
      field: (row) => row.carbonAvoided,
    },
  ];
  
  const investors = ref<Investor[]>([/* ... */]);
    onMounted(async () => {
  try {
    const response = await axios.get('http://localhost:8080/api/investors');
    investors.value = response.data;
  } catch (error) {
    console.error('Error fetching investors:', error);
  }
});
  </script>