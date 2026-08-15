//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/location_name.dart';
import 'package:openapi/src/model/region_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/location_area_summary.dart';
import 'package:openapi/src/model/location_game_index.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_detail.g.dart';

/// LocationDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [region] 
/// * [names] 
/// * [gameIndices] 
/// * [areas] 
@BuiltValue()
abstract class LocationDetail implements Built<LocationDetail, LocationDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'region')
  RegionSummary get region;

  @BuiltValueField(wireName: r'names')
  BuiltList<LocationName> get names;

  @BuiltValueField(wireName: r'game_indices')
  BuiltList<LocationGameIndex> get gameIndices;

  @BuiltValueField(wireName: r'areas')
  BuiltList<LocationAreaSummary> get areas;

  LocationDetail._();

  factory LocationDetail([void updates(LocationDetailBuilder b)]) = _$LocationDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationDetail> get serializer => _$LocationDetailSerializer();
}

class _$LocationDetailSerializer implements PrimitiveSerializer<LocationDetail> {
  @override
  final Iterable<Type> types = const [LocationDetail, _$LocationDetail];

  @override
  final String wireName = r'LocationDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'region';
    yield serializers.serialize(
      object.region,
      specifiedType: const FullType(RegionSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(LocationName)]),
    );
    yield r'game_indices';
    yield serializers.serialize(
      object.gameIndices,
      specifiedType: const FullType(BuiltList, [FullType(LocationGameIndex)]),
    );
    yield r'areas';
    yield serializers.serialize(
      object.areas,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RegionSummary),
          ) as RegionSummary;
          result.region.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationName)]),
          ) as BuiltList<LocationName>;
          result.names.replace(valueDes);
          break;
        case r'game_indices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationGameIndex)]),
          ) as BuiltList<LocationGameIndex>;
          result.gameIndices.replace(valueDes);
          break;
        case r'areas':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaSummary)]),
          ) as BuiltList<LocationAreaSummary>;
          result.areas.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

