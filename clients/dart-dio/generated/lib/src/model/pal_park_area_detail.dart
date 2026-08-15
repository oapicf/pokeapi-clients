//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pal_park_area_name.dart';
import 'package:openapi/src/model/pal_park_area_detail_pokemon_encounters_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pal_park_area_detail.g.dart';

/// PalParkAreaDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [names] 
/// * [pokemonEncounters] 
@BuiltValue()
abstract class PalParkAreaDetail implements Built<PalParkAreaDetail, PalParkAreaDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'names')
  BuiltList<PalParkAreaName> get names;

  @BuiltValueField(wireName: r'pokemon_encounters')
  BuiltList<PalParkAreaDetailPokemonEncountersInner> get pokemonEncounters;

  PalParkAreaDetail._();

  factory PalParkAreaDetail([void updates(PalParkAreaDetailBuilder b)]) = _$PalParkAreaDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PalParkAreaDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PalParkAreaDetail> get serializer => _$PalParkAreaDetailSerializer();
}

class _$PalParkAreaDetailSerializer implements PrimitiveSerializer<PalParkAreaDetail> {
  @override
  final Iterable<Type> types = const [PalParkAreaDetail, _$PalParkAreaDetail];

  @override
  final String wireName = r'PalParkAreaDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PalParkAreaDetail object, {
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
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PalParkAreaName)]),
    );
    yield r'pokemon_encounters';
    yield serializers.serialize(
      object.pokemonEncounters,
      specifiedType: const FullType(BuiltList, [FullType(PalParkAreaDetailPokemonEncountersInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PalParkAreaDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PalParkAreaDetailBuilder result,
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
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PalParkAreaName)]),
          ) as BuiltList<PalParkAreaName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_encounters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PalParkAreaDetailPokemonEncountersInner)]),
          ) as BuiltList<PalParkAreaDetailPokemonEncountersInner>;
          result.pokemonEncounters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PalParkAreaDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PalParkAreaDetailBuilder();
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

