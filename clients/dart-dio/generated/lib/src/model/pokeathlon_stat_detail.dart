//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokeathlon_stat_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokeathlon_stat_detail_affecting_natures.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokeathlon_stat_detail.g.dart';

/// PokeathlonStatDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [affectingNatures] 
/// * [names] 
@BuiltValue()
abstract class PokeathlonStatDetail implements Built<PokeathlonStatDetail, PokeathlonStatDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'affecting_natures')
  PokeathlonStatDetailAffectingNatures get affectingNatures;

  @BuiltValueField(wireName: r'names')
  BuiltList<PokeathlonStatName> get names;

  PokeathlonStatDetail._();

  factory PokeathlonStatDetail([void updates(PokeathlonStatDetailBuilder b)]) = _$PokeathlonStatDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokeathlonStatDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokeathlonStatDetail> get serializer => _$PokeathlonStatDetailSerializer();
}

class _$PokeathlonStatDetailSerializer implements PrimitiveSerializer<PokeathlonStatDetail> {
  @override
  final Iterable<Type> types = const [PokeathlonStatDetail, _$PokeathlonStatDetail];

  @override
  final String wireName = r'PokeathlonStatDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokeathlonStatDetail object, {
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
    yield r'affecting_natures';
    yield serializers.serialize(
      object.affectingNatures,
      specifiedType: const FullType(PokeathlonStatDetailAffectingNatures),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokeathlonStatDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokeathlonStatDetailBuilder result,
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
        case r'affecting_natures':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokeathlonStatDetailAffectingNatures),
          ) as PokeathlonStatDetailAffectingNatures;
          result.affectingNatures.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatName)]),
          ) as BuiltList<PokeathlonStatName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokeathlonStatDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokeathlonStatDetailBuilder();
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

