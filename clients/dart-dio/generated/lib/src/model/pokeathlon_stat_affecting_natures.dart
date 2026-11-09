//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokeathlon_stat_affecting_nature.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokeathlon_stat_affecting_natures.g.dart';

/// PokeathlonStatAffectingNatures
///
/// Properties:
/// * [increase] - A list of natures and how they change the referenced Pokéathlon stat.
/// * [decrease] - A list of natures and how they change the referenced Pokéathlon stat.
@BuiltValue()
abstract class PokeathlonStatAffectingNatures implements Built<PokeathlonStatAffectingNatures, PokeathlonStatAffectingNaturesBuilder> {
  /// A list of natures and how they change the referenced Pokéathlon stat.
  @BuiltValueField(wireName: r'increase')
  BuiltList<PokeathlonStatAffectingNature> get increase;

  /// A list of natures and how they change the referenced Pokéathlon stat.
  @BuiltValueField(wireName: r'decrease')
  BuiltList<PokeathlonStatAffectingNature> get decrease;

  PokeathlonStatAffectingNatures._();

  factory PokeathlonStatAffectingNatures([void updates(PokeathlonStatAffectingNaturesBuilder b)]) = _$PokeathlonStatAffectingNatures;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokeathlonStatAffectingNaturesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokeathlonStatAffectingNatures> get serializer => _$PokeathlonStatAffectingNaturesSerializer();
}

class _$PokeathlonStatAffectingNaturesSerializer implements PrimitiveSerializer<PokeathlonStatAffectingNatures> {
  @override
  final Iterable<Type> types = const [PokeathlonStatAffectingNatures, _$PokeathlonStatAffectingNatures];

  @override
  final String wireName = r'PokeathlonStatAffectingNatures';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokeathlonStatAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'increase';
    yield serializers.serialize(
      object.increase,
      specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatAffectingNature)]),
    );
    yield r'decrease';
    yield serializers.serialize(
      object.decrease,
      specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatAffectingNature)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokeathlonStatAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokeathlonStatAffectingNaturesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'increase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatAffectingNature)]),
          ) as BuiltList<PokeathlonStatAffectingNature>;
          result.increase.replace(valueDes);
          break;
        case r'decrease':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokeathlonStatAffectingNature)]),
          ) as BuiltList<PokeathlonStatAffectingNature>;
          result.decrease.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokeathlonStatAffectingNatures deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokeathlonStatAffectingNaturesBuilder();
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


