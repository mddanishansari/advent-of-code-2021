package org.md.advent.of.code

val day1Input = intArrayOf(191,185,188,189,204,213,215,227,222,221,236,235,236,232,224,228,234,226,227,228,230,232,234,213,197,198,210,238,248,261,263,265,262,295,296,311,330,333,337,344,345,356,359,360,364,367,383,386,387,391,424,426,428,440,442,446,450,423,428,423,425,445,429,436,465,456,463,461,463,483,484,500,517,525,529,527,530,535,566,578,582,587,604,613,614,609,611,619,623,627,621,622,626,644,646,655,657,659,661,671,673,668,673,676,682,683,678,679,682,681,684,686,690,693,698,700,702,707,708,732,733,734,743,745,776,794,804,784,790,813,856,855,859,850,851,886,885,888,889,883,885,920,919,917,915,918,909,910,924,925,932,933,935,966,970,971,974,958,959,961,959,964,969,970,973,972,976,998,1009,1010,1011,1046,1047,1040,1041,1056,1062,1061,1062,1077,1078,1080,1082,1094,1096,1097,1103,1128,1125,1167,1176,1175,1173,1183,1182,1183,1188,1202,1204,1205,1206,1207,1212,1235,1236,1256,1268,1270,1276,1281,1283,1276,1287,1292,1295,1291,1297,1298,1301,1312,1316,1333,1327,1340,1338,1348,1364,1381,1382,1383,1394,1385,1388,1387,1388,1394,1398,1400,1397,1399,1401,1408,1410,1420,1421,1434,1433,1436,1456,1455,1479,1482,1483,1522,1526,1527,1542,1543,1544,1548,1557,1571,1574,1580,1579,1602,1618,1605,1608,1612,1622,1625,1626,1633,1648,1641,1643,1650,1652,1659,1678,1681,1688,1692,1702,1686,1688,1685,1684,1674,1694,1696,1695,1720,1729,1736,1762,1763,1767,1780,1789,1796,1798,1799,1800,1808,1800,1805,1848,1849,1867,1888,1902,1903,1920,1923,1926,1930,1933,1925,1906,1878,1898,1899,1930,1936,1948,1974,1983,1984,1986,1983,1984,1987,1985,1988,1992,2005,2009,2013,2025,2033,2043,2046,2030,2014,2009,2011,2013,2043,2049,2053,2065,2070,2079,2080,2090,2092,2102,2116,2138,2140,2141,2143,2149,2152,2153,2154,2170,2194,2192,2216,2231,2246,2261,2268,2269,2252,2260,2264,2274,2289,2293,2296,2297,2300,2305,2334,2329,2353,2357,2359,2364,2374,2377,2364,2365,2366,2360,2362,2360,2361,2367,2357,2362,2376,2379,2380,2381,2401,2436,2435,2439,2446,2454,2456,2459,2492,2493,2514,2519,2524,2529,2530,2535,2548,2549,2551,2548,2553,2552,2556,2563,2570,2603,2616,2617,2623,2630,2631,2641,2645,2660,2662,2663,2664,2662,2668,2673,2677,2687,2688,2699,2698,2691,2695,2696,2710,2711,2717,2722,2723,2747,2746,2754,2753,2752,2771,2773,2774,2777,2789,2790,2805,2807,2818,2817,2825,2818,2828,2833,2834,2837,2839,2854,2856,2858,2859,2863,2880,2882,2884,2887,2888,2889,2902,2911,2917,2936,2938,2940,2943,2944,2943,2947,2954,2956,2957,2959,2957,2958,2959,2956,2959,2960,2969,2974,2979,2983,2985,2986,2992,2993,2995,3025,3037,3036,3037,3038,3040,3043,3049,3058,3071,3072,3080,3083,3081,3090,3091,3070,3076,3079,3083,3084,3086,3101,3114,3106,3107,3137,3138,3139,3137,3133,3137,3102,3108,3109,3124,3130,3138,3149,3150,3160,3171,3191,3190,3200,3205,3229,3235,3237,3238,3239,3243,3244,3245,3246,3250,3265,3268,3269,3271,3279,3278,3279,3280,3281,3290,3295,3296,3300,3303,3304,3305,3308,3325,3313,3326,3327,3335,3336,3337,3335,3361,3378,3374,3378,3387,3406,3416,3418,3438,3454,3460,3475,3476,3477,3471,3476,3477,3486,3487,3500,3502,3503,3530,3531,3530,3556,3563,3564,3565,3566,3580,3587,3591,3598,3599,3612,3613,3624,3623,3631,3660,3661,3662,3668,3671,3672,3674,3683,3684,3693,3694,3700,3696,3699,3705,3706,3710,3717,3731,3734,3729,3735,3736,3739,3749,3734,3739,3742,3753,3756,3757,3775,3777,3774,3780,3785,3786,3790,3792,3796,3798,3802,3817,3818,3815,3822,3824,3849,3856,3871,3845,3847,3849,3851,3853,3884,3885,3887,3889,3891,3894,3895,3900,3918,3935,3936,3941,3945,3936,3942,3945,3942,3943,3965,3974,3976,3979,3975,3976,3980,3993,3992,3991,3999,4000,3996,4019,4028,4029,4031,4053,4054,4080,4087,4089,4088,4098,4100,4103,4104,4112,4125,4145,4148,4152,4153,4158,4162,4165,4177,4184,4203,4205,4206,4207,4211,4215,4221,4240,4247,4253,4261,4262,4265,4269,4273,4274,4258,4260,4264,4282,4299,4313,4284,4287,4289,4290,4293,4295,4297,4296,4310,4314,4313,4327,4329,4330,4328,4338,4347,4368,4371,4373,4379,4388,4392,4396,4393,4394,4393,4397,4406,4409,4410,4414,4437,4436,4428,4429,4434,4426,4427,4428,4445,4447,4467,4471,4470,4472,4485,4487,4493,4495,4491,4497,4500,4506,4507,4508,4511,4518,4519,4523,4520,4523,4540,4541,4548,4549,4550,4551,4560,4570,4586,4575,4581,4585,4586,4591,4601,4595,4597,4601,4613,4615,4617,4619,4604,4609,4610,4616,4640,4666,4676,4677,4678,4709,4704,4719,4727,4729,4730,4747,4753,4755,4768,4770,4772,4777,4781,4811,4814,4843,4844,4846,4850,4862,4863,4868,4869,4870,4871,4874,4881,4882,4878,4887,4895,4898,4910,4920,4908,4910,4909,4914,4916,4922,4914,4918,4926,4949,4952,4953,4955,4956,4959,4985,4986,4990,4992,5028,5029,5032,5030,5037,5038,5047,5053,5054,5059,5057,5059,5062,5067,5085,5086,5090,5084,5077,5078,5081,5091,5094,5096,5095,5097,5103,5118,5144,5146,5153,5160,5169,5173,5174,5175,5184,5187,5195,5196,5216,5225,5238,5239,5232,5235,5237,5242,5244,5247,5254,5262,5271,5281,5287,5288,5260,5264,5282,5295,5301,5304,5310,5295,5296,5297,5298,5303,5304,5305,5277,5278,5289,5295,5290,5297,5299,5320,5328,5341,5347,5356,5361,5364,5365,5378,5379,5377,5378,5367,5380,5381,5387,5385,5390,5391,5392,5415,5422,5423,5425,5439,5441,5448,5455,5470,5477,5482,5488,5489,5492,5501,5499,5496,5499,5533,5552,5562,5563,5565,5566,5572,5571,5581,5583,5589,5594,5593,5596,5602,5606,5629,5643,5644,5652,5673,5676,5680,5676,5681,5696,5703,5698,5718,5720,5733,5736,5741,5766,5771,5786,5787,5793,5790,5786,5804,5805,5808,5809,5816,5810,5811,5818,5829,5836,5839,5824,5839,5843,5845,5849,5853,5856,5861,5873,5894,5895,5896,5897,5898,5899,5900,5913,5917,5918,5923,5924,5934,5935,5952,5965,5963,5958,5961,5975,5988,5989,5996,5997,6008,6011,6023,6024,6033,6048,6050,6051,6049,6048,6043,6048,6051,6055,6081,6084,6087,6093,6092,6090,6078,6079,6103,6092,6094,6099,6100,6116,6123,6129,6127,6138,6139,6141,6143,6146,6147,6159,6162,6163,6177,6179,6183,6187,6188,6194,6198,6213,6237,6267,6282,6288,6292,6297,6310,6323,6325,6324,6347,6349,6350,6353,6363,6376,6384,6394,6397,6401,6402,6399,6415,6416,6421,6422,6423,6420,6445,6446,6449,6451,6457,6460,6461,6467,6468,6473,6474,6517,6522,6519,6515,6532,6533,6535,6530,6532,6522,6548,6549,6565,6568,6579,6556,6563,6565,6572,6576,6578,6601,6608,6611,6612,6626,6619,6651,6657,6658,6666,6665,6660,6682,6704,6705,6711,6708,6716,6720,6725,6727,6729,6733,6734,6737,6736,6741,6742,6743,6750,6756,6757,6758,6755,6774,6773,6774,6780,6781,6790,6791,6800,6812,6815,6817,6827,6826,6832,6833,6834,6833,6822,6825,6829,6836,6840,6846,6850,6861,6868,6869,6872,6879,6882,6884,6907,6917,6930,6924,6934,6931,6918,6924,6928,6934,6935,6936,6953,6955,6964,6987,6999,7009,7042,7048,7027,7054,7053,7072,7073,7055,7056,7057,7079,7080,7084,7095,7108,7107,7109,7111,7134,7135,7137,7138,7145,7151,7161,7172,7179,7183,7189,7188,7189,7195,7202,7236,7241,7250,7277,7295,7297,7294,7298,7297,7301,7289,7291,7276,7293,7295,7311,7318,7341,7378,7398,7408,7409,7412,7409,7413,7397,7399,7423,7424,7423,7426,7418,7414,7409,7412,7425,7426,7433,7439,7448,7462,7466,7467,7468,7477,7480,7481,7498,7499,7501,7507,7527,7535,7548,7551,7552,7555,7561,7554,7559,7560,7587,7590,7596,7620,7628,7645,7646,7652,7653,7654,7663,7670,7678,7683,7686,7687,7683,7692,7691,7687,7688,7691,7699,7698,7725,7733,7734,7736,7740,7751,7744,7724,7719,7729,7731,7746,7747,7749,7722,7725,7730,7735,7737,7738,7739,7724,7721,7724,7736,7727,7730,7731,7732,7736,7737,7768,7787,7797,7807,7815,7819,7825,7852,7856,7862,7869,7881,7882,7885,7888,7892,7889,7893,7895,7896,7901,7919,7921,7932,7933,7964,7979,7990,7991,7994,7997,8011,8005,8006,8014,8047,8049,8064,8065,8046,8047,8079,8081,8082,8083,8055,8052,8056,8063,8064,8066,8053,8067,8072,8073,8077,8079,8081,8076,8083,8086,8098,8100,8109,8107,8124,8125,8126,8127,8145,8146,8152,8175,8176,8177,8182,8193,8195,8197,8199,8203,8204,8213,8217,8237,8240,8239,8230,8237,8245,8259,8264,8272,8288,8285,8286,8300,8301,8304,8305,8327,8326,8327,8341,8343,8356,8357,8358,8367,8374,8375,8391,8392,8393,8394,8399,8405,8402,8404,8435,8444,8484,8481,8490,8492,8493,8494,8503,8506,8516,8515,8516,8504,8508,8513,8529,8542,8545,8541,8546,8549,8570,8552,8553,8581,8578,8585,8593,8596,8605,8606,8608,8616,8627,8628,8627,8639,8644,8645,8626,8633,8635,8636,8640,8645,8655,8673,8693,8694,8695,8696,8695,8714,8716,8742,8739,8735,8740,8763,8762,8771,8772,8777,8776,8787,8788,8795,8796,8777,8782,8783,8794,8800,8810,8827,8828,8833,8829,8841,8862,8865,8867,8869,8895,8899,8901,8904,8908,8909,8927,8928,8930,8931,8935,8945,8946,8950,8954,8957,8959,8949,8961,8976,8980,8986,8988,8992,9003,9008,9009,9029,9050,9051,9054,9055,9068,9054,9071,9082,9087,9089,9112,9113,9127,9126,9125,9129,9138,9140,9145,9149,9151,9179,9185,9187,9188,9189,9186,9190,9207,9208,9209,9221,9228,9252,9254,9264,9267,9276,9287,9293,9292,9260,9261,9260,9265,9266,9285,9287,9289,9290,9291,9292,9293,9295,9313,9314,9291,9282,9304,9315,9316,9317,9327,9345,9350,9352,9356,9366,9367,9400,9407,9408,9415,9418,9419,9432,9441,9442,9439,9440,9451,9455,9464,9472,9479,9481,9490,9514,9527,9546,9552,9556,9570,9582,9584,9592,9597,9602,9618,9619,9622,9639,9645,9648,9643,9647,9648,9650,9641,9665,9678,9681,9682,9683,9692,9703,9704,9702,9704,9712,9726,9731,9732,9733,9744,9745,9757,9755,9763,9764,9766,9768,9782,9780,9781,9783,9786,9803,9804,9821,9822,9840,9841,9843,9839,9840,9846,9856,9859,9863,9862,9864,9865,9866,9870,9878,9877,9894,9896,9937,9938,9943,9944,9943,9952,9962,9983,9985,9984,9992,10002,10003,10041,10040,10041,10040,10042,10029,10034,10033,10034,10052,10053,10062,10055,10056,10057,10069,10073,10067,10070,10065,10064,10069,10071,10092,10069,10070,10080,10095,10099,10100,10101,10099,10115,10116,10117,10122,10124,10129,10096,10101,10106,10099,10102,10143,10144,10145,10146,10148,10149,10150,10160,10132,10137,10177,10181,10178,10183,10189,10191,10192,10194,10203,10199,10207,10218,10223,10224,10225,10245,10239,10247,10252,10250,10254,10255,10256,10279,10280,10292,10293,10300,10310,10312,10321,10324,10326,10330,10329,10328,10329,10333,10355,10354,10349,10352,10357,10369,10386,10387,10402,10406,10407,10404,10405,10407,10408,10412,10413,10417,10420,10412,10426,10427,10424,10433,10434,10435,10456,10472,10492,10494,10508,10510,10511,10512,10513,10514,10507,10510,10511,10515,10525,10526)
val day2Input = arrayOf("forward 2", "down 4", "down 1", "down 4", "forward 3", "down 6", "down 5", "forward 3", "forward 8", "down 2", "down 3", "up 8", "down 5", "up 7", "down 7", "forward 5", "up 2", "down 6", "forward 7", "forward 1", "forward 2", "forward 7", "up 7", "forward 6", "down 3", "down 1", "up 9", "down 2", "up 1", "down 1", "up 6", "forward 6", "down 7", "forward 6", "up 1", "down 6", "forward 2", "up 7", "forward 4", "forward 8", "forward 7", "down 7", "forward 8", "down 1", "down 6", "down 7", "forward 4", "down 3", "up 7", "down 5", "down 9", "up 8", "up 4", "down 2", "down 3", "up 7", "forward 6", "forward 6", "forward 8", "forward 2", "up 5", "down 8", "down 3", "down 3", "down 4", "down 9", "down 6", "up 6", "forward 4", "down 6", "forward 3", "forward 3", "down 4", "down 8", "down 2", "up 5", "up 5", "forward 3", "forward 5", "down 7", "forward 6", "forward 9", "forward 8", "forward 2", "down 3", "down 3", "down 7", "down 1", "down 1", "down 1", "down 2", "down 8", "down 6", "forward 6", "up 1", "up 6", "down 7", "down 1", "forward 1", "up 2", "up 8", "up 8", "forward 2", "down 1", "down 8", "down 7", "down 1", "forward 1", "down 9", "up 3", "down 3", "forward 2", "down 3", "up 6", "down 2", "forward 7", "down 9", "down 6", "down 1", "forward 6", "down 4", "down 1", "down 3", "forward 3", "down 5", "forward 9", "down 5", "down 7", "up 8", "forward 8", "forward 8", "down 6", "down 1", "forward 8", "down 4", "up 4", "up 4", "up 2", "forward 2", "forward 2", "down 1", "up 8", "down 1", "down 7", "forward 5", "down 9", "down 2", "up 3", "down 1", "down 5", "forward 6", "down 7", "up 3", "forward 7", "down 4", "down 3", "forward 4", "up 8", "down 4", "forward 4", "forward 2", "forward 5", "down 5", "up 2", "forward 4", "down 4", "forward 6", "down 4", "forward 1", "down 5", "forward 2", "forward 2", "down 8", "forward 4", "forward 7", "down 3", "up 3", "forward 2", "forward 6", "forward 8", "down 2", "forward 4", "down 2", "up 9", "down 9", "down 2", "forward 5", "up 4", "forward 2", "down 2", "down 3", "forward 1", "down 2", "forward 8", "forward 8", "down 4", "forward 6", "down 3", "down 3", "down 5", "forward 8", "forward 4", "forward 1", "up 4", "up 2", "forward 8", "down 8", "forward 2", "forward 6", "up 1", "up 5", "forward 2", "forward 4", "forward 7", "forward 8", "forward 2", "down 3", "down 1", "down 9", "down 6", "up 5", "up 6", "forward 6", "down 3", "down 2", "down 1", "forward 5", "forward 2", "forward 7", "down 8", "down 7", "forward 7", "up 8", "forward 7", "down 1", "up 4", "forward 9", "forward 4", "forward 1", "down 3", "down 9", "down 7", "forward 1", "down 3", "forward 3", "down 4", "down 7", "forward 4", "up 6", "down 8", "up 1", "forward 6", "forward 1", "down 7", "down 8", "up 9", "up 4", "down 3", "down 7", "forward 8", "up 2", "up 6", "forward 8", "down 1", "up 4", "up 4", "forward 8", "down 2", "down 4", "down 3", "forward 5", "down 8", "forward 1", "down 2", "forward 9", "forward 3", "up 6", "down 6", "forward 6", "forward 4", "down 6", "down 3", "down 3", "forward 6", "down 5", "up 4", "down 9", "down 3", "down 6", "up 9", "forward 6", "down 2", "forward 7", "up 8", "down 3", "down 7", "down 9", "forward 6", "down 1", "forward 2", "down 1", "down 3", "down 3", "forward 5", "forward 2", "up 5", "forward 4", "up 7", "down 9", "forward 7", "forward 3", "down 6", "forward 1", "down 1", "up 8", "down 9", "up 3", "down 7", "up 9", "forward 7", "down 7", "down 9", "forward 9", "forward 7", "up 9", "down 7", "down 2", "down 7", "up 2", "down 3", "down 9", "down 6", "forward 7", "forward 8", "forward 8", "forward 6", "forward 9", "forward 4", "down 4", "down 5", "down 7", "forward 6", "forward 2", "forward 4", "forward 9", "down 4", "forward 6", "down 7", "up 1", "down 7", "forward 9", "forward 7", "down 4", "down 3", "up 6", "forward 8", "forward 7", "down 8", "forward 4", "up 6", "up 4", "forward 9", "forward 4", "forward 4", "forward 7", "down 1", "up 6", "forward 8", "forward 3", "up 6", "forward 4", "down 1", "up 2", "forward 1", "down 5", "forward 5", "up 4", "down 6", "down 3", "up 8", "forward 9", "down 2", "forward 4", "forward 8", "down 9", "forward 5", "forward 2", "down 9", "down 8", "forward 8", "down 7", "up 6", "forward 1", "up 9", "up 3", "forward 9", "down 6", "forward 9", "down 3", "down 3", "forward 7", "forward 5", "down 8", "down 9", "down 3", "down 6", "up 8", "down 9", "forward 8", "down 7", "down 5", "down 1", "up 4", "down 9", "forward 6", "forward 9", "up 6", "up 4", "forward 3", "forward 2", "forward 1", "down 1", "down 2", "forward 8", "up 6", "forward 5", "up 4", "down 1", "forward 5", "down 3", "down 6", "up 7", "forward 2", "forward 6", "forward 7", "forward 4", "down 5", "down 4", "forward 4", "down 6", "up 2", "up 2", "forward 7", "forward 3", "down 8", "down 1", "down 8", "forward 7", "forward 7", "up 5", "forward 4", "up 8", "down 9", "down 4", "down 4", "forward 5", "down 1", "forward 2", "down 6", "up 4", "down 8", "down 1", "down 9", "down 5", "up 5", "forward 4", "down 2", "down 8", "down 4", "forward 4", "forward 5", "down 8", "up 9", "forward 7", "forward 6", "down 8", "down 3", "up 7", "down 7", "forward 2", "forward 5", "forward 7", "down 9", "up 1", "down 6", "down 2", "forward 6", "forward 3", "forward 3", "up 9", "forward 4", "down 5", "down 7", "forward 8", "forward 6", "forward 5", "down 9", "down 5", "down 1", "down 7", "forward 9", "forward 8", "down 2", "down 4", "down 1", "up 5", "up 5", "forward 5", "down 3", "down 1", "forward 8", "up 9", "up 3", "down 3", "up 3", "up 5", "forward 8", "down 3", "up 3", "down 9", "up 6", "up 8", "forward 5", "up 2", "down 6", "forward 3", "down 2", "down 4", "forward 9", "forward 6", "forward 3", "up 5", "down 9", "down 7", "forward 9", "forward 7", "forward 5", "up 5", "up 1", "down 6", "forward 4", "forward 4", "down 7", "down 1", "up 3", "forward 6", "forward 4", "down 1", "forward 5", "forward 3", "forward 1", "forward 3", "up 3", "up 9", "down 7", "down 4", "forward 8", "down 8", "down 3", "up 2", "down 8", "forward 5", "down 7", "forward 6", "down 9", "up 5", "forward 4", "down 2", "forward 6", "down 8", "down 7", "forward 8", "forward 5", "down 2", "forward 7", "forward 5", "forward 7", "down 8", "forward 5", "down 8", "down 6", "down 7", "down 9", "forward 9", "down 6", "forward 8", "up 6", "up 1", "down 5", "forward 1", "forward 7", "up 2", "up 5", "up 6", "down 5", "down 5", "forward 7", "down 9", "down 2", "forward 9", "forward 3", "down 5", "up 2", "up 8", "forward 5", "forward 8", "up 1", "forward 3", "forward 1", "up 4", "forward 1", "down 9", "down 6", "forward 1", "down 4", "down 4", "forward 9", "down 3", "up 6", "down 3", "forward 6", "forward 6", "down 3", "forward 6", "down 3", "down 1", "forward 3", "down 7", "up 9", "forward 1", "down 7", "down 2", "up 8", "down 1", "down 9", "down 1", "down 4", "down 6", "down 3", "down 7", "down 2", "down 9", "down 2", "forward 4", "up 3", "down 4", "up 4", "down 1", "forward 5", "forward 7", "down 7", "forward 9", "forward 6", "down 8", "forward 6", "forward 7", "up 3", "down 3", "up 6", "forward 7", "up 4", "forward 4", "down 1", "up 8", "forward 7", "down 2", "up 6", "forward 1", "forward 3", "up 9", "up 8", "up 5", "forward 7", "up 5", "down 6", "forward 7", "forward 7", "down 4", "down 3", "forward 2", "down 8", "up 9", "up 6", "forward 7", "forward 5", "down 9", "down 2", "up 5", "down 3", "down 3", "up 5", "down 8", "forward 7", "down 4", "down 2", "up 9", "down 5", "down 8", "down 5", "down 6", "forward 9", "down 3", "down 8", "forward 3", "down 1", "down 9", "forward 1", "down 3", "up 9", "up 3", "forward 8", "up 2", "down 4", "up 5", "up 4", "down 9", "down 5", "up 3", "forward 2", "down 8", "forward 8", "forward 7", "up 4", "down 9", "down 6", "up 1", "forward 9", "up 8", "forward 4", "up 3", "down 4", "up 2", "up 7", "down 2", "forward 3", "down 8", "down 9", "up 7", "up 8", "forward 3", "forward 1", "forward 7", "forward 5", "forward 9", "forward 2", "up 1", "down 1", "up 4", "forward 1", "up 9", "forward 7", "forward 2", "down 6", "down 5", "forward 9", "forward 4", "down 6", "down 6", "up 8", "down 3", "up 8", "down 3", "forward 2", "down 1", "down 1", "forward 5", "down 1", "forward 9", "up 8", "forward 2", "down 5", "up 8", "up 8", "forward 8", "forward 8", "forward 3", "forward 2", "forward 8", "forward 9", "forward 8", "forward 6", "forward 4", "up 7", "forward 9", "forward 8", "up 7", "forward 6", "forward 9", "forward 8", "down 7", "forward 9", "down 4", "down 1", "up 1", "up 9", "forward 2", "down 6", "down 2", "down 8", "down 6", "up 8", "forward 7", "up 9", "forward 5", "forward 4", "forward 8", "up 4", "forward 4", "up 6", "forward 7", "forward 1", "up 8", "down 6", "forward 7", "forward 3", "forward 2", "down 4", "forward 4", "down 7", "down 6", "down 2", "up 3", "up 5", "down 7", "down 9", "up 8", "down 1", "up 1", "down 8", "up 8", "forward 8", "down 6", "down 1", "down 6", "forward 3", "down 9", "down 5", "up 3", "down 1", "down 1", "forward 4", "down 4", "up 3", "forward 8", "up 4", "down 3", "down 5", "down 3", "forward 6", "forward 3", "down 2", "forward 9", "forward 3", "forward 2", "down 2", "forward 6", "down 1", "down 1", "forward 5", "forward 4", "forward 6", "down 7", "forward 7", "forward 3", "forward 1", "up 3", "down 6", "forward 1", "up 9", "forward 9", "forward 5", "forward 3", "forward 3", "down 3", "up 8", "forward 5", "up 6", "forward 2", "down 7", "forward 2", "forward 8", "forward 8", "forward 3", "up 9", "down 5", "down 3", "forward 7", "up 9", "forward 4", "down 1", "down 3", "down 5", "down 2", "forward 9", "up 6", "down 3", "down 7", "down 3", "up 6", "forward 3", "down 4", "forward 2", "down 8", "down 2", "forward 7", "down 2", "down 9", "forward 1", "down 1", "down 9", "down 6", "forward 5", "down 1", "up 1", "forward 5", "forward 4", "forward 9", "down 3", "forward 3", "forward 5", "down 9", "forward 9", "down 8", "down 2", "forward 1", "up 1", "down 5", "forward 2", "up 9", "forward 9", "forward 7", "forward 9", "forward 3", "down 7", "forward 2", "down 4", "up 3", "down 7", "down 6", "forward 2", "down 2", "forward 8", "up 9", "down 1", "forward 7", "down 8", "forward 3", "down 2", "down 5", "down 5", "down 3", "forward 1", "up 9", "up 9", "down 8", "down 6", "up 7", "forward 7", "down 4", "forward 6", "down 9", "up 5", "up 6", "forward 4", "forward 1", "forward 1", "down 7", "down 8", "down 2", "down 4", "down 3", "up 8", "down 3", "forward 3", "forward 8", "up 3", "down 2", "forward 4", "down 3", "forward 5", "up 1", "down 9", "down 1", "down 4", "forward 3", "forward 6", "forward 7", "forward 2", "forward 9", "forward 1", "forward 6", "forward 7", "forward 2", "up 1", "down 6", "down 1", "forward 6", "down 6", "down 5", "forward 1")
val day3Input = arrayOf("101011111001","111111011110","010000111100","101000010000","011101100010","010111000101","011111011011","011010011111","000111000010","000010011001","000000100101","000110000010","011001010110","011010000101","010001000100","111101010101","000111110011","010111010000","010010000011","101011110011","010010010010","010110100101","101011010001","101011101100","100111011001","100111101001","111000111010","100111010101","101011100011","110011001010","111100011011","111101110001","101100000011","000011000100","001001000110","001011001010","010111101001","100011000111","111100010101","101100000010","001011111011","101100111001","101110110010","011111001010","001111001001","110111101100","011111001110","111000111110","011100101110","000001101011","110101001011","111000111001","010110011000","000101100101","101010110011","111100001000","100101000010","110000111111","011110001011","000110100110","110010001010","001110110011","000010000001","100010011111","001100001011","110001111001","100010011101","010100000111","110101000100","011110010111","100011010111","001011011111","110110010000","101110110000","101001001011","011110100000","100000000101","100101011100","111101101101","101100110110","000000011100","101111000111","110001000101","000110000110","001010001101","101101111111","011000011010","101111010000","001000101101","010100001111","101110011010","011110010000","001011011010","100100010000","111100011111","111101000110","010101101110","010001010010","100100000100","101010111010","001010001011","000011101110","011100110001","000001111111","100101000001","101110000100","111111100101","111010111100","111100000011","000111001110","010111001000","010010110000","100101000110","100111001111","101001110011","001110011000","111000001000","010110011001","000011001011","000100001101","100101110010","110111110011","011100000100","111011000010","110011010010","011011101110","010010111011","110100001000","100100111000","111001011011","110111000111","011010111110","010110011110","111111011111","101100110000","011000011100","001111111010","011110111111","101110110110","100100000011","001001100001","010010001001","101001100100","110100011001","000010101100","001010110001","001110011110","111000110011","110100001010","110110011110","111010100110","100110000000","001111010000","110001011010","000000101111","100110110101","011011100101","001011100100","100010111111","010011010011","010011100001","011001100110","000111101010","111101100010","111011101111","111001111001","001000001111","010100001001","000000011010","111011101110","100001000111","010010010101","011001100000","100101110011","010001011011","110011010000","111011001110","001111010111","110010110100","101111110000","000111011111","111111011001","010011001011","101000110011","001110101100","001110000110","001001110100","000101011001","101001111001","001111111001","100111111100","010100001010","011101111100","011100011011","111100110111","000110011000","100001111001","000111111111","111010010100","110011111011","010000001000","000010110101","000011111010","010011001110","011111000001","110011001110","100111110010","011111011110","011110110111","001011010010","110101010001","100000100010","000110100111","101100101010","001110111101","010000101101","001101011100","101101010111","101101010000","111000100010","011100110000","001111110111","001011000101","111100111000","001000001110","101010110101","010100110110","101110111000","110010000111","111100111010","100010111010","010001011111","010101011101","010011110011","000110110111","000001111011","110100010001","001000010100","101010011001","010011100110","110110011011","110111000100","101001110100","010001111110","011100001100","011011010101","110010010000","101001011101","101010010000","111011110100","011101110001","111000011110","100000100011","010110101001","110111111101","010101011011","000001110100","000000000010","111100101011","111100001100","110111000011","011000011001","110000011011","100010001011","110010011100","001010001000","011010000000","110111100001","000011001101","001010001001","000011101001","011010010111","111011011100","110001111011","001000111011","110001111111","111110011111","011000111101","001111101110","111111001011","010101110010","000011100000","100101101110","001100000100","101111001110","001000110101","111001011111","011111110101","010101011010","111000101100","011100000010","011101011110","011001101011","000100100100","100100010010","010011000100","111111100001","010000100000","111010001101","000010010110","100011101000","100110011010","000110100101","011111100101","111001101010","101110001011","101110101010","011000010110","101110011110","101011001000","001101000100","111100111001","011011101001","100000010100","100110101010","010110001100","010100100010","001001011101","110101101011","111110011001","011001011010","000101000100","100010111011","000111110010","011010001000","001110010000","100011001001","010010010000","110000010001","000000110110","011010000001","010100010101","000101011110","101100010111","010001111000","100010001100","100100100001","011011000010","111001001101","111001010101","111011011011","001101100010","010001000010","111111011101","011101101001","010011100011","000001000000","100100010110","010011000010","010110010001","111001001001","010110001110","000101110111","001011101001","001011111000","111110111100","000110111110","001100111100","001011000001","110000100111","000111001111","101101111001","111110100111","111111111111","111011010111","001101001011","011001011001","010110111101","111111000001","001001100100","111111101011","011111100011","010010110101","011010111011","010001010111","001011000011","100100001100","110011011010","000111111011","011101010011","010100010000","110100010011","101001110110","111101110010","000100001001","111001101110","111010110010","010011000001","110111011111","111101111000","100011010110","001001010001","010101100010","110101110100","000111101110","111011110110","010011011001","100000011000","111001110100","011110010100","110011011100","011011010100","101010101000","000000111111","001111110000","110000011100","100010100000","101110000000","011010011110","110101010110","011011100110","111000101000","100011101010","000001100001","101010011111","111100001010","111101001110","011010111010","001000011000","101011010010","101110001010","101110011000","000110000111","110001101111","100111000010","011000011101","100011000001","010001100100","111001100011","111111100000","111100101110","001101111101","110111101111","100001011110","111110100001","011110100001","110001001001","001111010010","011100100001","010101100011","011111011111","010100101111","100010001010","010101111000","000000001101","000011011010","100000010011","001111010011","101110110101","000100000000","001100101100","100111110100","001011100111","110110100000","111000000000","110011001101","010100011011","100011010100","000101011101","110111110001","010010100011","011101000000","100001001111","101010110100","110001101110","100011111001","011111011001","000101000010","001110100110","100011011111","100000000011","110100000101","001110110100","101101001110","000011010100","110000001100","110010110101","110110101010","001010001110","111000010100","011111100110","000100011110","010000010011","010010100001","000111010111","110001001101","010010110110","010111010011","101101011000","100001110111","101110001110","010001110000","101001111111","100000001100","000010000011","011110010011","110001000100","001101110111","110000110110","100010000100","100011111110","001010000101","111011010101","111100000010","110110010111","000100111011","011110111000","001100001000","101010100101","110000111100","010110100111","111111111011","110111011100","111101110000","111010000100","001000110000","101010101100","100011100011","110011110010","001010111110","100001010001","010010111000","000011001110","001100010000","011100110111","001011101100","011000111110","011101001111","011010000111","111000010000","001111001111","011001100111","011000110101","111100110010","000101000111","101100110001","110010110000","000011011111","110010011001","010011000101","010000111110","000100101000","101101100000","110011101110","011100100100","111011100100","100101010111","001000010111","011011110001","011100010000","001011110010","111111100011","001011111100","110011101100","100111000111","010011011111","100100110001","101111101001","101001110010","000010110111","111011111111","100011111010","101010111001","101111100001","000000011001","011111000011","000100001110","001011110100","000110111111","001101110101","000000010001","010111001100","001010100110","110110000101","110001000010","100010000011","001011001000","101111011110","111011111100","011000011000","101010101010","111010110011","110101000101","010101000110","000000010011","101000001010","100010101110","110110000001","011100010101","101000110111","010101000001","000011011100","110010100010","011110110011","010111111000","110100101101","111011111101","011111111101","100101001011","010111000001","000011011001","000011100010","100101111101","000000101001","111111000111","111011000110","101000001100","000110000001","001111011100","000100010000","100111101011","111011011010","011110010110","001010010101","100100110110","000101111001","000100011010","011010010010","001101001000","001011011110","000011101011","001100011001","110101100011","100010000101","011011100001","011011110000","100101100011","010110111000","001001001011","000010111110","000011010101","110110011111","001111000101","110101111011","011010010100","000100110011","110011110110","010011101011","100100001101","110010000101","010111100111","100111111000","011001001011","011010100011","110101111000","011000111010","011101000100","001100110000","010101111011","101010010010","010001000110","000101111111","110111001000","110101111010","100110010100","110001000001","011110001001","010111110011","010001010110","011100111001","110000010110","010000010110","010111111011","000101101110","100000001111","010111111010","000010001111","100101110100","000111100010","000000101101","010001011010","010110111010","011110111010","110100000100","101110000011","110110100100","110111110111","110101011100","100010010101","001010110100","110101001101","000100110010","111111111010","001001000001","000011110001","010110111011","001111101011","010100100101","001110010111","100010010111","100011110101","001100001100","010000000100","011010110011","100011101110","010000000001","100010010011","110100111001","000000110001","000001000101","011011001011","000100101001","010100001110","000110001111","011110000110","110000000110","010101001000","000110111010","011111100010","111111010101","101011000001","001010101101","110101111111","001110110101","010100101001","110101100111","010000101000","011011110110","111111110110","010000100111","000011010001","101000011010","001110000000","111010110110","011110011110","100101001101","101000000010","001111101111","011100001011","011000011111","001001001010","100010011010","100010100011","000110010011","100001110100","010000011110","011111000100","001010101111","111111001100","010101110011","110100110000","010110010101","111011000111","001000111001","010110110101","110001011111","010010101100","110000101101","100010000001","111111110011","110000010010","111110000001","100101011000","010101010111","100111101100","100110101100","110111000110","000011111110","100101100010","000010010001","111100100011","001001111100","100011110110","111111011100","110001100011","110010111110","000100010001","000101100110","100100000110","010001101001","011010010110","100010110000","001000001000","101101011100","111100111110","001001011011","010111101000","100001100010","000101111101","101111110101","001110000111","010011010010","100100110101","101011011111","111100010010","110111010000","111001101011","100001001101","101100000101","011100101000","000000100011","000000111110","001010001100","100001110101","100111011100","110111100000","101010101011","001011000000","011011111110","001000101111","101111101100","001010011001","100110101001","101110010001","110000011101","001110000001","000001100110","011001101100","000100000101","110111010001","101101100100","010110101000","001100001001","000111001001","010010101000","101000001101","110010000001","110110010101","110110001111","101100110010","000101110101","011011101011","000100100111","110000111011","101011011010","000010101001","110101101010","111100101111","101001010111","110101100010","001100100010","101110111110","110011110101","000101111010","011000111001","110101001000","101000100010","111111001000","111001101100","110010100111","011010110100","100101111010","000110010101","101110000001","001011110011","011111110001","101000101001","011011001111","100010001110","111111110111","010101111100","100001000001","010011110100","001000010110","001011101111","010100011000","011110111101","111100110100","100111011011","000011001000","001110100000","010100011001","101110001101","100011001010","111101011001","000011100011","110101011110","111110001010","010100010010","000110110010","001001001001","100010110001","110000110101","111000101101","011110010101","010001000000","000110001001","011001111110","010100111111","001101110001","011110000001","110111111011","011101000111","110000111101","010001110100","010111011001","110111010101","001101000001","011010000010","110011010100","111000110110","001000000100","111011001111","010101010000","001011101010","010011010110","111101100101","111011011000","001000100010","111010000000","101111011111","100000111111","110010000000","100000011111","110011001011","001001111111","010101101101","111100011010","100101100101","001110001011","001110111111","101110011001","100100110111","110100000000","111010110111","111100110001","111010100000","010001100101","011110100010","100110010010","001010110010","011000100111","010011011000","110011010110","010000001110","011100111111","011011000100","101111001101","111111011010","011111010101","111011101101","011010000110","011111111011","010000011001","001010001111","100001010011","101011001101","011100111100","110100011111","011111011000","110010111001","111100100000","101111100010","100001101001","110010111011","010010001011","001000011110","000101010111","011011111001","101101000101","000101100111","101111111110","000100110111","111000011010","010110111100","111100001110","111000100001","010100000011","010100110111","110111010100","011001001101","100100101010","111110110000","110101110001","110010100000","001010011101","111101001101","010010000000","111010111011","011011110011","111010001111","101001111101","100110000110","000000000000","010001110011","100000111000","101010100010","010101100100","110000110000","000010011101","011111001000","111110011010","010101001001","011001111010","101111000011","110010111111","110110001101","000001010110","101011100001","100111100001","010100100000","100011101100","010001100011","110011000111","000000000101","101111110001","010110011101","111101000001","101101011011","100011101011")